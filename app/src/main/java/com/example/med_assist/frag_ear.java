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

public class frag_ear extends Fragment {

    Spinner ear1, ear2, ear3, ear4, ear5, ear6, ear7, ear8, ear9, ear10;
    static TextView txt;
    String x;

    public frag_ear(String bundle) {
        x= bundle;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag_ear, container, false);
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
            Toast.makeText(requireContext(),"successful " +" "+value, Toast.LENGTH_SHORT).show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        ear1 = view.findViewById(R.id.spinear1);
        ear2 = view.findViewById(R.id.spinear2);
        ear3 = view.findViewById(R.id.spinear3);
        ear4 = view.findViewById(R.id.spinear4);
        ear5 = view.findViewById(R.id.spinear6); //check
        ear6 = view.findViewById(R.id.spinear7);
        ear7 = view.findViewById(R.id.spinear8);
        ear8 = view.findViewById(R.id.spinear9);
        ear9 = view.findViewById(R.id.spinear10);
        ear10 = view.findViewById(R.id.spinear11);




        ArrayAdapter<CharSequence> adapter_ear1 = ArrayAdapter.createFromResource(requireContext(),
                R.array.ear1, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_ear2 = ArrayAdapter.createFromResource(getContext(),
                R.array.ear2, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_ear3 = ArrayAdapter.createFromResource(getContext(),
                R.array.ear3, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_ear4 = ArrayAdapter.createFromResource(getContext(),
                R.array.ear4, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_ear5 = ArrayAdapter.createFromResource(getContext(),
                R.array.ear5, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_ear6 = ArrayAdapter.createFromResource(getContext(),
                R.array.ear6, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_ear7 = ArrayAdapter.createFromResource(getContext(),
                R.array.ear7, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_ear8 = ArrayAdapter.createFromResource(getContext(),
                R.array.ear8, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_ear9 = ArrayAdapter.createFromResource(getContext(),
                R.array.ear9, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_ear10 = ArrayAdapter.createFromResource(getContext(),
                R.array.ear10, android.R.layout.simple_spinner_item);

        adapter_ear1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_ear2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_ear3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_ear4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_ear5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_ear6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_ear7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_ear8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_ear9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_ear10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ear1.setAdapter(adapter_ear1);
        ear2.setAdapter(adapter_ear2);
        ear3.setAdapter(adapter_ear3);
        ear4.setAdapter(adapter_ear4);
        ear5.setAdapter(adapter_ear5);
        ear6.setAdapter(adapter_ear6);
        ear7.setAdapter(adapter_ear7);
        ear8.setAdapter(adapter_ear8);
        ear9.setAdapter(adapter_ear9);
        ear10.setAdapter(adapter_ear10);
        ear1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                if(i == 0){
                    myFunction("2", "EarDCRos");

//                    Toast.makeText(getContext(), "0 is selected", Toast.LENGTH_SHORT).show();

                } else if (i==1) {
                    myFunction("3", "EarDCRos");
//                    Toast.makeText(getContext(), "1 is selected", Toast.LENGTH_SHORT).show();
                }else if (i==2) {
                     myFunction("4", "EarDCRos");
//                    Toast.makeText(getContext(), "1 is selected", Toast.LENGTH_SHORT).show();
            }
                // Perform actions based on the selected item
            }@Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        ear2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                if(i == 0){
                    myFunction("2", "MeatusTender");

//                    Toast.makeText(getContext(), "0 is selected", Toast.LENGTH_SHORT).show();

                } else if (i==1) {
                    myFunction("3", "MeatusTender");
//                    Toast.makeText(getContext(), "1 is selected", Toast.LENGTH_SHORT).show();
                }


            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();


            }
        });

        ear3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                if(i==0){
                    myFunction("2", "MeatusEdematous");
                } else if (i==1) {
                    myFunction("3", "MeatusEdematous");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        ear4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                if(i==0){
                    myFunction("2", "MeatusErythematous");
                } else if (i==1) {
                    myFunction("3", "MeatusErythematous");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        ear5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                if(i==0){
                    myFunction("2", "OtoscopicBulding");
                } else if (i==1) {
                    myFunction("3", "OtoscopicBulding");
                } else if (i==2) {
                    myFunction("4", "OtoscopicBulding");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        ear6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                if(i==0){
                    myFunction("2", "HistoryOfHavingWetEar");
                } else if (i==1) {
                    myFunction("3", "HistoryOfHavingWetEar");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        ear7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                if(i==0){
                    myFunction("2", "HistoryOfEarTraumaPriorToPain");
                } else if (i==1) {
                    myFunction("3", "HistoryOfEarTraumaPriorToPain");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        ear8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                if(i==0){
                    myFunction("4", "OtoscopicPus");
                } else if (i==1) {
                    myFunction("2", "OtoscopicPus");
                } else if (i==2) {
                    myFunction("3", "OtoscopicPus");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();
            }
        });

        ear9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                if(i==0){
                    myFunction("2", "EarPainRos");
                } else if (i==1) {
                    myFunction("3", "EarPainRos");
                } else if (i==2) {
                    myFunction("5", "EarPainRos");
                } else if (i==3) {
                    myFunction("6", "EarPainRos");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        ear10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }
                if (i==0) {
                    myFunction("2", "HearingLossRos");
                } else if (i==1) {
                    myFunction("3", "HearingLossRos");
                } else if (i==2) {
                    myFunction("4", "HearingLossRos");
                } else if (i==3) {
                    myFunction("5", "HearingLossRos");
                } else if (i==4) {
                    myFunction("6", "HearingLossRos");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        ear1.setSelection(-1);
        ear2.setSelection(-1);
        ear3.setSelection(-1);
        ear4.setSelection(-1);
        ear5.setSelection(-1);
        ear6.setSelection(-1);
        ear7.setSelection(-1);
        ear8.setSelection(-1);
        ear9.setSelection(-1);
        ear10.setSelection(-1);


    }

}
