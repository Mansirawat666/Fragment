package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1,b2;
FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.logs);
        b2 = findViewById(R.id.reg);
        fm=getSupportFragmentManager();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            fm.beginTransaction().replace(R.id.frame,new LoginFrag()).commit();
                Toast.makeText(MainActivity.this, "login", Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fm.beginTransaction().replace(R.id.frame,new RegisterFrag()).commit();
                Toast.makeText(MainActivity.this, "Register", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
