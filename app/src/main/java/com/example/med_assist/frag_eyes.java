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

public class frag_eyes extends Fragment {

    Spinner eye1, eye2, eye3, eye4,eye5;
    static TextView txt;
    String x;

    public frag_eyes(String bundle) {
        x= bundle;
    }

    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag_eyes, container, false);
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



        eye1 = view.findViewById(R.id.spineyes1);
        eye2 = view.findViewById(R.id.spineyes2);
        eye3 = view.findViewById(R.id.spineyes3);
        eye4 = view.findViewById(R.id.spineyes4);
        eye5 = view.findViewById(R.id.spineyes5);





        ArrayAdapter<CharSequence> adapter_eye1 = ArrayAdapter.createFromResource(requireContext(),
                R.array.eye1, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_eye2 = ArrayAdapter.createFromResource(getContext(),
                R.array.eye2, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_eye3 = ArrayAdapter.createFromResource(getContext(),
                R.array.eye3, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_eye4 = ArrayAdapter.createFromResource(getContext(),
                R.array.eye4, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_eye5 = ArrayAdapter.createFromResource(getContext(),
                R.array.eye5, android.R.layout.simple_spinner_item);


        adapter_eye1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_eye2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_eye3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_eye4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_eye5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        eye1.setAdapter(adapter_eye1);
        eye2.setAdapter(adapter_eye2);
        eye3.setAdapter(adapter_eye3);
        eye4.setAdapter(adapter_eye4);
        eye5.setAdapter(adapter_eye5);

        eye1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                if(i==0){
                    myFunction("2", "VisualAcuityRos");
                } else if (i==1) {
                    myFunction("3", "VisualAcuityRos");
                } else if (i==2) {
                    myFunction("4", "VisualAcuityRos");
                } else if (i==3) {
                    myFunction("5", "VisualAcuityRos");
                } else if (i==4) {
                    myFunction("6", "VisualAcuityRos");
                }
                // Perform actions based on the selected item

            }@Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        eye2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                if(i==0){
                    myFunction("2", "BlindnessRos");
                } else if (i==1) {
                    myFunction("3", "BlindnessRos");
                } else if (i==2) {
                    myFunction("4", "BlindnessRos");

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        eye3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                if(i==0){
                    myFunction("2", "DoubleVisionRos");
                } else if (i==1) {
                    myFunction("3", "DoubleVisionRos");
                } else if (i==2) {
                    myFunction("4", "DoubleVisionRos");

                } else if (i==3) {
                    myFunction("5", "DoubleVisionRos");

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();


            }
        });

        eye4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                if(i==0){
                    myFunction("2", "EyesItchy");
                } else if (i==1) {
                    myFunction("3", "EyesItchy");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        eye5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                if(i==0){
                    myFunction("2", "DryEyes");
                } else if (i==1) {
                    myFunction("3", "DryEyes");
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });


        eye1.setSelection(-1);
        eye2.setSelection(-1);
        eye3.setSelection(-1);
        eye4.setSelection(-1);
        eye5.setSelection(-1);



    }

}
