package com.example.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFrag extends Fragment {


    EditText r1,e2,e3;
    TextView a1,a2,a3;
    View v;
    Button b1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_register, container, false);


        r1=v.findViewById(R.id.e1);
        e2=v.findViewById(R.id.e2);
        e3=v.findViewById(R.id.e3);
        b1=v.findViewById(R.id.b1);
        a1=v.findViewById(R.id.a1);
        a2=v.findViewById(R.id.a2);
        a3=v.findViewById(R.id.a3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1=r1.getText().toString();
                String s2=e2.getText().toString();
                String s3=e3.getText().toString();
                a1.setText(s1);
                a2.setText(s2);
                a3.setText(s3);
                Toast.makeText(getActivity(), "log", Toast.LENGTH_SHORT).show();
            }
        });
        return  v;

    }

}

