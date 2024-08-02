package com.example.med_assist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {

    private Button mRegister;
    private ProgressBar spinner;
    private EditText mEmail , mPassword, mName;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener firebaseAuthStateListener;
    private String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    private static final String TAG ="Register";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        spinner = (ProgressBar) findViewById(R.id.pBar);
        spinner.setVisibility(View.GONE);
        TextView existing = (TextView) findViewById(R.id.logintransfer);
        mAuth = FirebaseAuth.getInstance();
        firebaseAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                spinner.setVisibility(View.VISIBLE);
                final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if(user !=null && user.isEmailVerified()){
                    Intent intent = new Intent(Register.this , MainActivity.class);
                    startActivity(intent);
                    finish();
                    spinner.setVisibility(View.GONE);
                }spinner.setVisibility(View.GONE);
            }
        };

        //transfer to login page
        existing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this , login.class);
                startActivity(intent);
                finish();
            }
        });


        mRegister = (Button) findViewById(R.id.signupbtn);
        mEmail = (EditText) findViewById(R.id.email);
        mPassword = (EditText) findViewById(R.id.password);
        mName = (EditText) findViewById(R.id.username);

        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spinner.setVisibility(View.VISIBLE);

                final String email = mEmail.getText().toString();
                final String password = mPassword.getText().toString();
                final String name = mName.getText().toString();

                if(checkInputs(name,email,password)){
                    mAuth.createUserWithEmailAndPassword(email,password)
                            .addOnCompleteListener(Register.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if(!task.isSuccessful()){
                                        Toast.makeText(Register.this,task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                    }else{
                                        mAuth.getCurrentUser().sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task) {
                                                if(task.isSuccessful()){
                                                    Toast.makeText(Register.this, "Registration Successful"+"Please check your Email for Verification", Toast.LENGTH_SHORT).show();
                                                    String userId = mAuth.getCurrentUser().getUid();
                                                    DatabaseReference currentUserDb = FirebaseDatabase.getInstance().getReference().child("Users").child(userId);

                                                    Map userInfo = new HashMap<>();
                                                    userInfo.put("name",name);
                                                    userInfo.put("profileImageUrl","default");
                                                    currentUserDb.updateChildren(userInfo);

                                                    mEmail.setText("");
                                                    mName.setText("");
                                                    mPassword.setText("");

                                                    Intent intent = new Intent(Register.this,MainActivity.class);
                                                    startActivity(intent);
                                                    finish();

                                                }
                                                else{
                                                    Toast.makeText(Register.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                                }
                                            }
                                        });
                                    }
                                }
                            });
                }
                spinner.setVisibility(View.GONE);
            }
        });
    }

    private boolean checkInputs(String name, String email, String password) {
        if(email.equals("") || name.equals("") || password.equals("")){
            Toast.makeText(this, "All fields must be filled", Toast.LENGTH_SHORT).show();
            return false;
        }
        if(!email.matches(emailPattern)){
            Toast.makeText(this, "Invalid Email Address", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
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

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(Register.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}