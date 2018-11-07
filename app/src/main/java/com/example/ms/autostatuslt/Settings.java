package com.example.ms.autostatuslt;

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

public class Settings extends Fragment {

    private static final String TAG = "Nustatymai";

    private Button button_Automobilis1;
    private Button button_Automobilis2;
    private Button button_Automobilis3;
    private Button button_Automobilis1_edit;
    private Button button_Automobilis2_edit;
    private Button button_Automobilis3_edit;


    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.settings_layout, container, false);

//        button_Automobilis1 = (Button) view.findViewById(R.id.button_automobilis1);

//        button_Automobilis1_edit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                button_Automobilis1.setText("Mercedesas");
//                //navigate to fragment method called
//            }
//        });

        Log.d(TAG, "onCreateView: Started.");

        return view;
    }
}
