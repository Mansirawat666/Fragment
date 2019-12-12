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
public class LoginFrag extends Fragment {


  EditText e1,e2;
  Button b1;
  View v;
  TextView t1,t2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate(import) the layout for this fragment
        v= inflater.inflate(R.layout.fragment_login, container, false);
        e1=v.findViewById(R.id.e1);
        e2=v.findViewById(R.id.e2);
        b1=v.findViewById(R.id.logbuttonss);
        t1=v.findViewById(R.id.t1);
        t2=v.findViewById(R.id.t2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                t1.setText(s1);
                t2.setText(s2);
                Toast.makeText(getActivity(), "log", Toast.LENGTH_SHORT).show();
            }
        });
        return  v;

    }

}
