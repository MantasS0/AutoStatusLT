package com.example.ms.autostatuslt;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Pagrindinis extends Fragment {

    private static final String TAG = "Pagrindinis";

    private Button buttonNavigate_Settings;
    private Button buttonNavigate_Stats;
    private Button button_AddToDataBase;
    //private Button buttonNavigate_Activity2;

    public String automobilioPavadinimas1="Automobilis 1"; //??

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.pagrindinis_layout, container,false);

        buttonNavigate_Settings = (Button) view.findViewById(R.id.buttonNavigate_settings);
        buttonNavigate_Stats = (Button) view.findViewById(R.id.buttonNavigate_stats);
        button_AddToDataBase = (Button) view.findViewById(R.id.button_addToDataBase);
//        buttonNavigate_Activity2 = (Button) view.findViewById(R.id.buttonNavigate_activity2);
        Log.d(TAG, "onCreateView: Started.");

        buttonNavigate_Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Nustatymai", Toast.LENGTH_SHORT).show();
                //navigate to fragment method called
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });
        buttonNavigate_Stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Išplėstinė automobilio statistika", Toast.LENGTH_LONG).show();
                //navigate to fragment method called
                ((MainActivity)getActivity()).setViewPager(2);

            }
        });
        button_AddToDataBase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Duomenys pridėti", Toast.LENGTH_SHORT).show();
                //navigate to fragment method called
                ((MainActivity)getActivity()).setViewPager(3);

            }
        });
//        buttonNavigate_Activity2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getActivity(),"Going to Activity 2", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(getActivity(),Activity2.class);
//                startActivity(intent);
//            }
//        });



        return view;
    }
}
