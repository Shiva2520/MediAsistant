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

public class fag_throat extends Fragment {
    Spinner throat1, throat2, throat3, throat4,throat5, throat6, throat7,throat8,throat9, throat10, throat11;
    TextView txt;
    String x;

    public fag_throat(String bundle) {
        x= bundle;
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag_throat, container, false);

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



        throat1 = view.findViewById(R.id.spinThroat1);
        throat2 = view.findViewById(R.id.spinThroat2);
        throat3 = view.findViewById(R.id.spinThroat3);
        throat4 = view.findViewById(R.id.spinThroat4);
        throat5 = view.findViewById(R.id.spinThroat5);
        throat6 = view.findViewById(R.id.spinThroat6);
        throat7 = view.findViewById(R.id.spinThroat7);
        throat8 = view.findViewById(R.id.spinThroat8);
        throat9 = view.findViewById(R.id.spinThroat9);
        throat10 = view.findViewById(R.id.spinThroat10);
        throat11 = view.findViewById(R.id.spinThroat11);




        ArrayAdapter<CharSequence> adapter_throat1 = ArrayAdapter.createFromResource(getContext(),
                R.array.throat1, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_throat2 = ArrayAdapter.createFromResource(getContext(),
                R.array.throat2, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_throat3 = ArrayAdapter.createFromResource(getContext(),
                R.array.throat3, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_throat4 = ArrayAdapter.createFromResource(getContext(),
                R.array.throat4, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_throat5 = ArrayAdapter.createFromResource(getContext(),
                R.array.throat5, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_throat6 = ArrayAdapter.createFromResource(getContext(),
                R.array.throat6, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_throat7 = ArrayAdapter.createFromResource(getContext(),
                R.array.throat7, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_throat8 = ArrayAdapter.createFromResource(getContext(),
                R.array.throat8, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_throat9 = ArrayAdapter.createFromResource(getContext(),
                R.array.throat9, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_throat10 = ArrayAdapter.createFromResource(getContext(),
                R.array.throat10, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_throat11 = ArrayAdapter.createFromResource(getContext(),
                R.array.throat11, android.R.layout.simple_spinner_item);

        adapter_throat1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_throat2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_throat3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_throat4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_throat5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_throat6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_throat7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_throat8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_throat9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_throat10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_throat11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        throat1.setAdapter(adapter_throat1);
        throat2.setAdapter(adapter_throat2);
        throat3.setAdapter(adapter_throat3);
        throat4.setAdapter(adapter_throat4);
        throat5.setAdapter(adapter_throat5);
        throat6.setAdapter(adapter_throat6);
        throat7.setAdapter(adapter_throat7);
        throat8.setAdapter(adapter_throat8);
        throat9.setAdapter(adapter_throat9);
        throat10.setAdapter(adapter_throat10);
        throat11.setAdapter(adapter_throat11);


        throat1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                if(i==0){
                    myFunction("2", "FluidIntake");
                } else if (i==1) {
                    myFunction("3", "FluidIntake");
                }
                // Perform actions based on the selected item

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });



        throat2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                if(i==0){
                    myFunction("2", "FluidNoLytesIntake");
                } else if (i==1) {
                    myFunction("3", "FluidNoLytesIntake");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();


            }
        });

        throat3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                if(i==0){
                    myFunction("2", "SwallowPain");
                } else if (i==1) {
                    myFunction("3", "SwallowPain");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();


            }
        });

        throat4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                if(i==0){
                    myFunction("2", "SolidsSwallow");
                } else if (i==1) {
                    myFunction("3", "SolidsSwallow");
                } else if (i==2) {
                    myFunction("4", "SolidsSwallow");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        throat5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                if(i==0){
                    myFunction("2", "FluidsSwallow");
                } else if (i==1) {
                    myFunction("3", "FluidsSwallow");
                } else if (i==2) {
                    myFunction("4", "FluidsSwallow");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        throat6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                if(i==0){
                    myFunction("2", "ChokingSwallow");
                } else if (i==1) {
                    myFunction("3", "ChokingSwallow");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        throat7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                if(i==0){
                    myFunction("2", "RegurgFood");
                } else if (i==1) {
                    myFunction("3", "RegurgFood");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        throat8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                if(i==0){
                    myFunction("2", "Polydipsia");
                } else if (i==1) {
                    myFunction("3", "Polydipsia");
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();
            }
        });

        throat9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                if(i==0){
                    myFunction("2", "Hoarseness");
                } else if (i==1) {
                    myFunction("3", "Hoarseness");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        throat10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                if(i==0){
                    myFunction("2", "LarynxPain");
                } else if (i==1) {
                    myFunction("3", "LarynxPain");
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        throat11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                if(i==0){
                    myFunction("2", "SoreThroatROS");
                } else if (i==1) {
                    myFunction("4", "SoreThroatROS");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });
        throat1.setSelection(-1);
        throat2.setSelection(-1);
        throat3.setSelection(-1);
        throat4.setSelection(-1);
        throat5.setSelection(-1);
        throat6.setSelection(-1);
        throat7.setSelection(-1);
        throat8.setSelection(-1);
        throat9.setSelection(-1);
        throat10.setSelection(-1);
        throat11.setSelection(-1);


    }

}
