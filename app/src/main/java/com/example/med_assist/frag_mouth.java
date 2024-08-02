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

public class frag_mouth extends Fragment {
    Spinner mouth1, mouth2, mouth3, mouth4, mouth5, mouth6, mouth7, mouth8;
    String x;

    public frag_mouth(String bundle) {
        x= bundle;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag_mouth, container, false);
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

        mouth1 = view.findViewById(R.id.spinmouth1);
        mouth2 = view.findViewById(R.id.spinmouth2);
        mouth3 = view.findViewById(R.id.spinmouth3);
        mouth4 = view.findViewById(R.id.spinmouth4);
        mouth5 = view.findViewById(R.id.spinmouth5);
        mouth6 = view.findViewById(R.id.spinmouth6);
        mouth7 = view.findViewById(R.id.spinmouth7);
        mouth8 = view.findViewById(R.id.spinmouth8);





        ArrayAdapter<CharSequence> adapter_mouth1 = ArrayAdapter.createFromResource(getContext(),
                R.array.mouth1, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_mouth2 = ArrayAdapter.createFromResource(getContext(),
                R.array.mouth2, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_mouth3 = ArrayAdapter.createFromResource(getContext(),
                R.array.mouth3, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_mouth4 = ArrayAdapter.createFromResource(getContext(),
                R.array.mouth4, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_mouth5 = ArrayAdapter.createFromResource(getContext(),
                R.array.mouth5, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_mouth6 = ArrayAdapter.createFromResource(getContext(),
                R.array.mouth6, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_mouth7 = ArrayAdapter.createFromResource(getContext(),
                R.array.mouth7, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_mouth8 = ArrayAdapter.createFromResource(getContext(),
                R.array.mouth8, android.R.layout.simple_spinner_item);

        adapter_mouth1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_mouth2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_mouth3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_mouth4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_mouth5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_mouth6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_mouth7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_mouth8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);




        mouth1.setAdapter(adapter_mouth1);
        mouth2.setAdapter(adapter_mouth2);
        mouth3.setAdapter(adapter_mouth3);
        mouth4.setAdapter(adapter_mouth4);
        mouth5.setAdapter(adapter_mouth5);
        mouth6.setAdapter(adapter_mouth6);
        mouth7.setAdapter(adapter_mouth7);
        mouth8.setAdapter(adapter_mouth8);


        mouth1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "LossOfTaste");

                // Perform actions based on the selected item

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });



        mouth2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "EasyBleedingFromGums");
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();


            }
        });

        mouth3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "Angioedema");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();


            }
        });

        mouth4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "Trismus");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        mouth5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "AphtousUlcers");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });
        mouth6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "GlossitisOnROS");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });
        mouth7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "PainBehindJawAngle");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });
        mouth8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "DryMucusMembranes");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        mouth1.setSelection(-1);
        mouth2.setSelection(-1);
        mouth3.setSelection(-1);
        mouth4.setSelection(-1);
        mouth5.setSelection(-1);
        mouth6.setSelection(-1);
        mouth7.setSelection(-1);
        mouth8.setSelection(-1);


    }

}
