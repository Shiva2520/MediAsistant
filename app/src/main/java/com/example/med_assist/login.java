package com.example.med_assist;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Objects;

public class login extends AppCompatActivity {


    TextView registerTransfer;
    EditText loginMail , loginPassword;
    Button LoginBtn;
    ProgressBar spinner;
    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener firebaseAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        registerTransfer = (TextView) findViewById(R.id.registerTransfer);
        loginMail = (EditText) findViewById(R.id.email_login);
        loginPassword = (EditText) findViewById(R.id.password_login);
        LoginBtn = (Button) findViewById(R.id.loginbtn);
        spinner = (ProgressBar) findViewById(R.id.pBar);

        registerTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,Register.class);
                startActivity(intent);
            }
        });

        //to login directly
        mAuth = FirebaseAuth.getInstance();
        firebaseAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
//                spinner.setVisibility(View.VISIBLE);
                final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if(user !=null && user.isEmailVerified()){
                    Intent intent = new Intent(login.this , MainActivity.class);
                    startActivity(intent);
                    finish();
                    spinner.setVisibility(View.GONE);
                }
                spinner.setVisibility(View.GONE);
            }
        };

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = loginMail.getText().toString();
                String pass = loginPassword.getText().toString().trim();


                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    loginMail.setError("Invalid Email-ID");
                    loginMail.setFocusable(true);
                }
                else{
                    loginUser(email , pass);
                }

            }
        });

    }

    private void loginUser(String email, String pass) {

        mAuth.signInWithEmailAndPassword(email, pass)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            FirebaseUser user = mAuth.getCurrentUser();


                            //if user is logged in for the first time than show user info from google
                            if (Objects.requireNonNull(task.getResult().getAdditionalUserInfo()).isNewUser()){
                                //get user Email and uid

                                assert user != null;
                                String Email = user.getEmail();
                                String Uid = user.getUid();

                                HashMap<Object , String> hashMap = new HashMap<>();
                                //put info in hashmap
                                hashMap.put("email" , Email);
                                hashMap.put("uid", Uid);
                                hashMap.put("name","");
                                // hashMap.put("onlineStatus","Online");
                                hashMap.put("phone","");
                                hashMap.put("image","");
                                hashMap.put("cover","");
                                //Firebase database Instance

                                FirebaseDatabase database = FirebaseDatabase.getInstance();
                                //Path to user data named Users
                                DatabaseReference reference = database.getReference("Users");

                                //put data in hashmap
                                reference.child(Uid).setValue(hashMap);
                            }


                            startActivity(new Intent(login.this , MainActivity.class));
                            finish();

                        } else
                        {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(login.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();

                        }
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                        Toast.makeText(login.this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
    }


    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(firebaseAuthStateListener);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mAuth.removeAuthStateListener(firebaseAuthStateListener);
    }
}