package com.example.ms.autostatuslt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class Activity2 extends AppCompatActivity {
    private static final String TAG = "Activity2";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_layout);

        Log.d(TAG, "onCreate: Started.");
    }
}
