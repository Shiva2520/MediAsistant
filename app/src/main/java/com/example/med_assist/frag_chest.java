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

public class frag_chest extends Fragment {

    Spinner chest1, chest2, chest3, chest4, chest5, chest6, chest7, chest8, chest9, chest10, chest11;
    static TextView txt;
    String x;
    public frag_chest(String bundle) {
        x= bundle;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag_chest, container, false);
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



        chest1 = view.findViewById(R.id.spinchest1);
        chest2 = view.findViewById(R.id.spinchest2);
        chest3 = view.findViewById(R.id.spinchest3);
        chest4 = view.findViewById(R.id.spinchest4);
        chest5 = view.findViewById(R.id.spinchest5);
        chest6 = view.findViewById(R.id.spinchest6);
        chest7 = view.findViewById(R.id.spinchest7);
        chest8 = view.findViewById(R.id.spinchest8);
        chest9 = view.findViewById(R.id.spinchest9);
        chest10 = view.findViewById(R.id.spinchest10);
        chest11 = view.findViewById(R.id.spinchest11);




        ArrayAdapter<CharSequence> adapter_chest1 = ArrayAdapter.createFromResource(getContext(),
                R.array.chest1, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_chest2 = ArrayAdapter.createFromResource(getContext(),
                R.array.chest2, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_chest3 = ArrayAdapter.createFromResource(getContext(),
                R.array.chest3, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_chest4 = ArrayAdapter.createFromResource(getContext(),
                R.array.chest4, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_chest5 = ArrayAdapter.createFromResource(getContext(),
                R.array.chest5, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_chest6 = ArrayAdapter.createFromResource(getContext(),
                R.array.chest6, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_chest7 = ArrayAdapter.createFromResource(getContext(),
                R.array.chest7, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_chest8 = ArrayAdapter.createFromResource(getContext(),
                R.array.chest8, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_chest9 = ArrayAdapter.createFromResource(getContext(),
                R.array.chest9, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_chest10 = ArrayAdapter.createFromResource(getContext(),
                R.array.chest10, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_chest11 = ArrayAdapter.createFromResource(getContext(),
                R.array.chest11, android.R.layout.simple_spinner_item);

        adapter_chest1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_chest2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_chest3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_chest4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_chest5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_chest6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_chest7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_chest8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_chest9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_chest10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_chest11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        chest1.setAdapter(adapter_chest1);
        chest2.setAdapter(adapter_chest2);
        chest3.setAdapter(adapter_chest3);
        chest4.setAdapter(adapter_chest4);
        chest5.setAdapter(adapter_chest5);
        chest6.setAdapter(adapter_chest6);
        chest7.setAdapter(adapter_chest7);
        chest8.setAdapter(adapter_chest8);
        chest9.setAdapter(adapter_chest9);
        chest10.setAdapter(adapter_chest10);
        chest11.setAdapter(adapter_chest11);


        chest1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "ChestPain");

                // Perform actions based on the selected item

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });



        chest2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "ChestPain2");
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();


            }
        });

        chest3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "ChestDiscomfort");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();


            }
        });

        chest4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "ChestDiscomfort");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        chest5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "ChestEmotion");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        chest6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "ChestQuality");


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        chest7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "ChestRadiate");


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        chest8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "ChestWhere");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();
            }
        });

        chest9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "ChestRepro");


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        chest10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "CoughStop");


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        chest11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "NitroGlycer");


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });
        chest1.setSelection(-1);
        chest2.setSelection(-1);
        chest3.setSelection(-1);
        chest4.setSelection(-1);
        chest5.setSelection(-1);
        chest6.setSelection(-1);
        chest7.setSelection(-1);
        chest8.setSelection(-1);
        chest9.setSelection(-1);
        chest10.setSelection(-1);
        chest11.setSelection(-1);


    }


}
