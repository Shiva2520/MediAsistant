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

public class frag_lb extends Fragment {

    Spinner lb1, lb2, lb3, lb4, lb5, lb6;
    String x;
    public frag_lb(String bundle) {
        x= bundle;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag_lb, container, false);
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



        lb1 = view.findViewById(R.id.spinlb1);
        lb2 = view.findViewById(R.id.spinlb2);
        lb3 = view.findViewById(R.id.spinlb3);
        lb4 = view.findViewById(R.id.spinlb4);
        lb5 = view.findViewById(R.id.spinlb5);
        lb6 = view.findViewById(R.id.spinlb6);




        ArrayAdapter<CharSequence> adapter_lb1 = ArrayAdapter.createFromResource(getContext(),
                R.array.lb1, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_lb2 = ArrayAdapter.createFromResource(getContext(),
                R.array.lb2, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_lb3 = ArrayAdapter.createFromResource(getContext(),
                R.array.lb3, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_lb4 = ArrayAdapter.createFromResource(getContext(),
                R.array.lb4, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_lb5 = ArrayAdapter.createFromResource(getContext(),
                R.array.lb5, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_lb6 = ArrayAdapter.createFromResource(getContext(),
                R.array.lb6, android.R.layout.simple_spinner_item);

        adapter_lb1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_lb2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_lb3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_lb4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_lb5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_lb6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        lb1.setAdapter(adapter_lb1);
        lb2.setAdapter(adapter_lb2);
        lb3.setAdapter(adapter_lb3);
        lb4.setAdapter(adapter_lb4);
        lb5.setAdapter(adapter_lb5);
        lb6.setAdapter(adapter_lb6);



        lb1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "LowbackPain");

                // Perform actions based on the selected item

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });



        lb2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "LowbackSeverity");
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();


            }
        });

        lb3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "LowbackPainFlexion");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();


            }
        });

        lb4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "LowbackPainTrig");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        lb5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "LowbackPainSleep");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        lb6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "LowbackPainExercise");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });



        lb1.setSelection(-1);
        lb2.setSelection(-1);
        lb3.setSelection(-1);
        lb4.setSelection(-1);
        lb5.setSelection(-1);
        lb6.setSelection(-1);




    }

}
