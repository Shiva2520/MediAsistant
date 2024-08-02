package com.example.med_assist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
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

public class frag_nose extends Fragment {

    Spinner nose1, nose2, nose3, nose4;
    static TextView txt;
    String x;
    public frag_nose(String bundle) {
        x= bundle;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag_nose, container, false);
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



        nose1 = view.findViewById(R.id.spinNose1);
        nose2 = view.findViewById(R.id.spinNose2);
        nose3 = view.findViewById(R.id.spinNose3);
        nose4 = view.findViewById(R.id.spinNose4);





        ArrayAdapter<CharSequence> adapter_nose1 = ArrayAdapter.createFromResource(getContext(),
                R.array.nose1, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_nose2 = ArrayAdapter.createFromResource(getContext(),
                R.array.nose2, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_nose3 = ArrayAdapter.createFromResource(getContext(),
                R.array.nose3, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_nose4 = ArrayAdapter.createFromResource(getContext(),
                R.array.nose4, android.R.layout.simple_spinner_item);


        adapter_nose1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_nose2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_nose3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_nose4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        nose1.setAdapter(adapter_nose1);
        nose2.setAdapter(adapter_nose2);
        nose3.setAdapter(adapter_nose3);
        nose4.setAdapter(adapter_nose4);


        nose1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();
                String value = "3";
                if(selectedItem.equals("0")){
                    value = "2";
                } else if (selectedItem.equals("1")) {
                    value = "3";
                }

                myFunction(value, "LossOfSmell");

                // Perform actions based on the selected item

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });



        nose2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();
                String value = "3";
                if(selectedItem.equals("0")){
                    value = "2";
                } else if (selectedItem.equals("1")) {
                    value = "3";
                }

                myFunction(value, "RunnyNoseCongestion");
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();


            }
        });

        nose3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();
                String value = "3";
                if(selectedItem.equals("0")){
                    value = "2";
                } else if (selectedItem.equals("1")) {
                    value = "3";
                }

                myFunction(value, "PostNasalDrainage");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();


            }
        });

        nose4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();
                String value = "3";
                if(selectedItem.equals("0")){
                    value = "2";
                } else if (selectedItem.equals("1")) {
                    value = "3";
                }

                myFunction(value, "SinusesPainRos");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });




        nose1.setSelection(-1);
        nose2.setSelection(-1);
        nose3.setSelection(-1);
        nose4.setSelection(-1);





    }

}
