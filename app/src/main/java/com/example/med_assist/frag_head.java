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

public class frag_head extends Fragment {

    Spinner head1, head2, head3, head4, head5, head6, head7, head8, head9, head10, head11, head12, head13, head14, head15, head16, head17;
    String x;
    public frag_head(String bundle) {
        x= bundle;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag_head, container, false);

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

        head1 = view.findViewById(R.id.spinHead1);
        head2 = view.findViewById(R.id.spinHead2);
        head3 = view.findViewById(R.id.spinHead3);
        head4 = view.findViewById(R.id.spinHead4);
        head5 = view.findViewById(R.id.spinHead5);
        head6 = view.findViewById(R.id.spinHead6);
        head7 = view.findViewById(R.id.spinHead7);
        head8 = view.findViewById(R.id.spinHead8);
        head9 = view.findViewById(R.id.spinHead9);
        head10 = view.findViewById(R.id.spinHead10);
        head11 = view.findViewById(R.id.spinHead11);
        head12 = view.findViewById(R.id.spinHead12);
        head13 = view.findViewById(R.id.spinHead13);
        head14 = view.findViewById(R.id.spinHead14);
        head15= view.findViewById(R.id.spinHead15);
        head16 = view.findViewById(R.id.spinHead16);
        head17 = view.findViewById(R.id.spinHead17);


        ArrayAdapter<CharSequence> adapter_head1 = ArrayAdapter.createFromResource(getContext(),
                R.array.head1, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_head2 = ArrayAdapter.createFromResource(getContext(),
                R.array.head2, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_head3 = ArrayAdapter.createFromResource(getContext(),
                R.array.head3, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_head4 = ArrayAdapter.createFromResource(getContext(),
                R.array.head4, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_head5 = ArrayAdapter.createFromResource(getContext(),
                R.array.head5, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_head6 = ArrayAdapter.createFromResource(getContext(),
                R.array.head6, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_head7 = ArrayAdapter.createFromResource(getContext(),
                R.array.head7, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_head8 = ArrayAdapter.createFromResource(getContext(),
                R.array.head8, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_head9 = ArrayAdapter.createFromResource(getContext(),
                R.array.head9, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_head10 = ArrayAdapter.createFromResource(getContext(),
                R.array.head10, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_head11 = ArrayAdapter.createFromResource(getContext(),
                R.array.head11, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_head12 = ArrayAdapter.createFromResource(getContext(),
                R.array.head12, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_head13 = ArrayAdapter.createFromResource(getContext(),
                R.array.head13, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_head14 = ArrayAdapter.createFromResource(getContext(),
                R.array.head14, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_head15 = ArrayAdapter.createFromResource(getContext(),
                R.array.head15, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_head16 = ArrayAdapter.createFromResource(getContext(),
                R.array.head16, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_head17 = ArrayAdapter.createFromResource(getContext(),
                R.array.head17, android.R.layout.simple_spinner_item);




        adapter_head1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_head2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_head3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_head4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_head5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_head6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_head7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_head8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_head9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_head10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_head11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_head12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_head13.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_head14.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_head15.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_head16.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_head17.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);







        head1.setAdapter(adapter_head1);
        head2.setAdapter(adapter_head2);
        head3.setAdapter(adapter_head3);
        head4.setAdapter(adapter_head4);
        head5.setAdapter(adapter_head5);
        head6.setAdapter(adapter_head6);
        head7.setAdapter(adapter_head7);
        head8.setAdapter(adapter_head8);
        head9.setAdapter(adapter_head9);
        head10.setAdapter(adapter_head10);
        head11.setAdapter(adapter_head11);
        head12.setAdapter(adapter_head12);
        head13.setAdapter(adapter_head13);
        head14.setAdapter(adapter_head14);
        head15.setAdapter(adapter_head15);
        head16.setAdapter(adapter_head16);
        head17.setAdapter(adapter_head17);

        head1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "AMS");

                // Perform actions based on the selected item

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });



        head2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "DecreasedLongTermMemoryOnExam");
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();


            }
        });

        head3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "DecreasedShortTermMemory");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();


            }
        });

        head4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "Seizure");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        head5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "AphasiaHx");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        head6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "AphasiaHxSensory");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        head7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "LossOfConsciousness");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        head8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "LossOfConsciousnessProdromePalpitations");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        head9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "LossOfConsciousnessProdromeChestPain");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        head10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "LossOfConsciousnessHeadache");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        head11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "LossOfConsciousnessSeizures");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        head12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "LossOfConsciousnessSphincter");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        head13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "LossOfConsciousnessPostictall");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        head14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "OrthostaticLightheadedness");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        head15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "DizzinessWithPosition");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        head16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "DizzinessWithExertion");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        head17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip the first selection
                }

                String selectedItem = parent.getItemAtPosition(i).toString();

                myFunction(selectedItem, "HeadacheFrontal");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show();

            }
        });

        head1.setSelection(-1);
        head2.setSelection(-1);
        head3.setSelection(-1);
        head4.setSelection(-1);
        head5.setSelection(-1);
        head6.setSelection(-1);
        head7.setSelection(-1);
        head8.setSelection(-1);
        head9.setSelection(-1);
        head10.setSelection(-1);
        head11.setSelection(-1);
        head12.setSelection(-1);
        head13.setSelection(-1);
        head14.setSelection(-1);
        head15.setSelection(-1);
        head16.setSelection(-1);
        head17.setSelection(-1);

    }
}
