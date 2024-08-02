package com.example.med_assist;

import android.annotation.SuppressLint;
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

public class frag_abdomen extends Fragment {

    Spinner abdomen2,abdomen3,abdomen4,abdomen5,abdomen6,abdomen7,abdomen8,abdomen9,abdomen10,abdomen11,abdomen12,abdomen13,abdomen14,abdomen15,abdomen16,abdomen17,abdomen18,abdomen19,abdomen20,abdomen21,abdomen22,abdomen23,abdomen24,abdomen25,abdomen26,abdomen27,abdomen28,abdomen29,abdomen30,abdomen31,abdomen32,abdomen33,abdomen34,abdomen35,abdomen36,abdomen37,abdomen38;
    static TextView txt;
    String x;

    public frag_abdomen(String bundle) {
        x= bundle;
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag_abdomen, container, false);

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



        abdomen2 = view.findViewById(R.id.spinAbdomen2);
        abdomen3 = view.findViewById(R.id.spinAbdomen3);
        abdomen4 = view.findViewById(R.id.spinAbdomen4);
        abdomen5 = view.findViewById(R.id.spinAbdomen5);
        abdomen6 = view.findViewById(R.id.spinAbdomen6);
        abdomen7 = view.findViewById(R.id.spinAbdomen7);
        abdomen8 = view.findViewById(R.id.spinAbdomen8);
        abdomen9 = view.findViewById(R.id.spinAbdomen9);
        abdomen10 = view.findViewById(R.id.spinAbdomen10);
        abdomen11 = view.findViewById(R.id.spinAbdomen11);
        abdomen12 = view.findViewById(R.id.spinAbdomen12);
        abdomen13 = view.findViewById(R.id.spinAbdomen13);
        abdomen14 = view.findViewById(R.id.spinAbdomen14);
        abdomen15 = view.findViewById(R.id.spinAbdomen15);
        abdomen16 = view.findViewById(R.id.spinAbdomen16);
        abdomen18 = view.findViewById(R.id.spinAbdomen18);
        abdomen19 = view.findViewById(R.id.spinAbdomen19);
        abdomen20 = view.findViewById(R.id.spinAbdomen20);
        abdomen21 = view.findViewById(R.id.spinAbdomen21);
        abdomen22 = view.findViewById(R.id.spinAbdomen22);
        abdomen23 = view.findViewById(R.id.spinAbdomen23);
        abdomen24 = view.findViewById(R.id.spinAbdomen24);
        abdomen25 = view.findViewById(R.id.spinAbdomen25);
        abdomen26 = view.findViewById(R.id.spinAbdomen26);
        abdomen27 = view.findViewById(R.id.spinAbdomen27);
        abdomen28 = view.findViewById(R.id.spinAbdomen28);
        abdomen29 = view.findViewById(R.id.spinAbdomen29);
        abdomen30 = view.findViewById(R.id.spinAbdomen30);
        abdomen31 = view.findViewById(R.id.spinAbdomen31);
        abdomen32 = view.findViewById(R.id.spinAbdomen32);
        abdomen33 = view.findViewById(R.id.spinAbdomen33);



        ArrayAdapter<CharSequence> adapter_abdomen2 = ArrayAdapter.createFromResource(getContext(),
                R.array.abdomen2, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen3 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen3, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen4 = ArrayAdapter.createFromResource(getContext(),
                R.array.abdomen4, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen5 = ArrayAdapter.createFromResource(getContext(),
                R.array.abdomen5, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen6 = ArrayAdapter.createFromResource(getContext(),
                R.array.abdomen6, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen7 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen7, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen8 = ArrayAdapter.createFromResource(getContext(),
                R.array.abdomen8, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen9 = ArrayAdapter.createFromResource(getContext(),
                R.array.abdomen9, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen10 = ArrayAdapter.createFromResource(getContext(),
                R.array.abdomen10, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen11 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen11, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen12 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen12, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen13 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen13, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen14 = ArrayAdapter.createFromResource(getContext(),
                R.array.abdomen14, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen15 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen15, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen16 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen16, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen17 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen17, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen18 = ArrayAdapter.createFromResource(getContext(),
                R.array.abdomen18, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen19 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen19, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen20 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen20, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen21 = ArrayAdapter.createFromResource(getContext(),
                R.array.abdomen21, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen22 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen22, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen23 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen23, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen24 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen24, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen25 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen25, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen26 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen26, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen27 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen27, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen28 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen28, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen29 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen29, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen30 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen30, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen31 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen31, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen32 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen32, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_abdomen33 = ArrayAdapter.createFromResource(getContext(),
                R.array.adbomen33, android.R.layout.simple_spinner_item);






        adapter_abdomen2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen13.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen14.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen15.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen16.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen17.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen18.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen19.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen20.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen21.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen22.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen23.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen24.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen25.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen26.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen27.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen28.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen29.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen30.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen31.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen32.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_abdomen33.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        abdomen2.setAdapter(adapter_abdomen2);
        abdomen3.setAdapter(adapter_abdomen3);
        abdomen4.setAdapter(adapter_abdomen4);
        abdomen5.setAdapter(adapter_abdomen5);
        abdomen6.setAdapter(adapter_abdomen6);
        abdomen7.setAdapter(adapter_abdomen7);
        abdomen8.setAdapter(adapter_abdomen8);
        abdomen9.setAdapter(adapter_abdomen9);
        abdomen10.setAdapter(adapter_abdomen10);
        abdomen11.setAdapter(adapter_abdomen11);
        abdomen12.setAdapter(adapter_abdomen12);
        abdomen13.setAdapter(adapter_abdomen13);
        abdomen14.setAdapter(adapter_abdomen14);
        abdomen15.setAdapter(adapter_abdomen15);
        abdomen16.setAdapter(adapter_abdomen16);
        abdomen17.setAdapter(adapter_abdomen17);
        abdomen18.setAdapter(adapter_abdomen18);
        abdomen19.setAdapter(adapter_abdomen19);
        abdomen20.setAdapter(adapter_abdomen20);
        abdomen21.setAdapter(adapter_abdomen21);
        abdomen22.setAdapter(adapter_abdomen22);
        abdomen23.setAdapter(adapter_abdomen23);
        abdomen24.setAdapter(adapter_abdomen24);
        abdomen25.setAdapter(adapter_abdomen25);
        abdomen26.setAdapter(adapter_abdomen26);
        abdomen27.setAdapter(adapter_abdomen27);
        abdomen28.setAdapter(adapter_abdomen28);
        abdomen29.setAdapter(adapter_abdomen29);
        abdomen30.setAdapter(adapter_abdomen30);
        abdomen31.setAdapter(adapter_abdomen31);
        abdomen32.setAdapter(adapter_abdomen32);
        abdomen33.setAdapter(adapter_abdomen33);

        abdomen2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "AbdDiscomfortExacerbatedByStress");

                // Perform actions based on the selected item

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });



        abdomen3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "AbdCramps");
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();


            }
        });

        abdomen4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "FlatulenceAbdSx");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();


            }
        });

        abdomen5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "StomachPainSeveritySx");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        abdomen6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "StomachPainDistributionSx");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });
        abdomen7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "StomachPainResolvesPRDXSx");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        abdomen8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "PeriAnalPainSx");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        abdomen9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "PeriAnalSoilingSx");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        abdomen10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "StomachPainProgressionSubjective");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        abdomen11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "StomachPainLength");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        abdomen12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "StomachPainDuration");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        abdomen13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "RUQPain");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        abdomen14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "LUQPain");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        abdomen15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "RLQPain");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        abdomen16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "LLQPain");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        abdomen17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "RLFlankPain");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        abdomen18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "StomachPainPeriumbilicalArea");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        abdomen19.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "StomachPainEpigastricArea");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        abdomen20.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "RLInguinalPain");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        abdomen21.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "RLInguinalPain");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });





    }

}
