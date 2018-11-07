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

public class Stats extends Fragment {

    private static final String TAG = "Stats";

    private Button button_Automobilis1;
    private Button button_Automobilis2;
    private Button button_Automobilis3;
    private Button button_Automobilis1_edit;
    private Button button_Automobilis2_edit;
    private Button button_Automobilis3_edit;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.stats_layout, container, false);

        button_Automobilis1 = (Button) view.findViewById(R.id.button_automobilis1);

        Log.d(TAG, "onCreateView: Started.");

        return view;
    }
}
