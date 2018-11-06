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

public class Fragment2 extends Fragment {

    private static final String TAG = "Fragment1";

    private Button buttonNavigate_Fragment1;
    private Button buttonNavigate_Fragment2;
    private Button buttonNavigate_Fragment3;
    private Button buttonNavigate_Activity2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2_layout, container,false);

        buttonNavigate_Fragment1 = (Button) view.findViewById(R.id.buttonNavigate_fragment1);
        buttonNavigate_Fragment2 = (Button) view.findViewById(R.id.buttonNavigate_fragment2);
        buttonNavigate_Fragment3 = (Button) view.findViewById(R.id.buttonNavigate_fragment3);
        buttonNavigate_Activity2 = (Button) view.findViewById(R.id.buttonNavigate_activity2);
        Log.d(TAG, "onCreateView: Started.");

        buttonNavigate_Fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Going to Fragamnet  1", Toast.LENGTH_SHORT).show();
                //navigate to fragment method called
                ((MainActivity)getActivity()).setViewPager(0);
            }
        });
        buttonNavigate_Fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Going to Fragamnet  2", Toast.LENGTH_SHORT).show();
                //navigate to fragment method called
                ((MainActivity)getActivity()).setViewPager(1);

            }
        });
        buttonNavigate_Fragment3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Going to Fragamnet  3", Toast.LENGTH_SHORT).show();
                //navigate to fragment method called
                ((MainActivity)getActivity()).setViewPager(2);

            }
        });
        buttonNavigate_Activity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Going to Activity 2", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(),Activity2.class);
                startActivity(intent);
            }
        });



        return view;
    }
}
