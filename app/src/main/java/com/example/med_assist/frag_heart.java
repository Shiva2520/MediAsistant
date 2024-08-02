package com.example.med_assist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class frag_heart extends Fragment {

    Spinner heart1, heart2, heart3, heart4, heart5, heart6;
    String x;


    public frag_heart(String bundle) {
        x= bundle;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag_heart, container, false);
    }

    public void myFunction(String value, String name) {

        OkHttpClient client = new OkHttpClient();

        RequestBody formBody = new FormBody.Builder()
                .add("SessionID", x)
                .add("name", name)
                .add("value", value)
                .build();

        Request request = new Request.Builder()
                .url("https://endlessmedicalapi1.p.rapidapi.com/UpdateFeature?name="+name + "&value="+value+"&SessionID="+x)
                .post(formBody)
                .addHeader("X-RapidAPI-Key", "3e7f6cf93bmsh01ecf416f76f66bp1530e1jsn2c928a1a48d3")
                .addHeader("X-RapidAPI-Host", "endlessmedicalapi1.p.rapidapi.com")
                .build();

        try {
            Response response = client.newCall(request).execute();
            Toast.makeText(requireContext(),"successful" + value, Toast.LENGTH_SHORT).show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        heart1 = view.findViewById(R.id.spinheart1);
        heart2 = view.findViewById(R.id.spinheart2);
        heart3 = view.findViewById(R.id.spinheart3);
        heart4 = view.findViewById(R.id.spinheart4);
        heart5 = view.findViewById(R.id.spinheart5);
        heart6 = view.findViewById(R.id.spinheart6);





        ArrayAdapter<CharSequence> adapter_heart1 = ArrayAdapter.createFromResource(getContext(),
                R.array.heart1, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_heart2 = ArrayAdapter.createFromResource(getContext(),
                R.array.heart2, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_heart3 = ArrayAdapter.createFromResource(getContext(),
                R.array.heart3, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_heart4 = ArrayAdapter.createFromResource(getContext(),
                R.array.heart4, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_heart5 = ArrayAdapter.createFromResource(getContext(),
                R.array.heart5, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_heart6 = ArrayAdapter.createFromResource(getContext(),
                R.array.heart6, android.R.layout.simple_spinner_item);





        adapter_heart1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_heart2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_heart3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_heart4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_heart5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_heart6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        heart1.setAdapter(adapter_heart1);
        heart2.setAdapter(adapter_heart2);
        heart3.setAdapter(adapter_heart3);
        heart4.setAdapter(adapter_heart4);
        heart5.setAdapter(adapter_heart5);
        heart6.setAdapter(adapter_heart6);

        heart1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "Arrhythmia");

                // Perform actions based on the selected item

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });



        heart2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "ArrhythmiaSymptomsLightheadedness");
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();


            }
        });

        heart3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "ArrhythmiaSymptomsChestPains");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();


            }
        });

        heart4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "ArrhythmiaSymptomsHeadaches");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        heart5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "ArrhythmiaSymptomsSweats");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        heart6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "ArrhythmiaSymptomsWeakness");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });


        heart1.setSelection(-1);
        heart2.setSelection(-1);
        heart3.setSelection(-1);
        heart4.setSelection(-1);
        heart5.setSelection(-1);
        heart6.setSelection(-1);



    }

}
