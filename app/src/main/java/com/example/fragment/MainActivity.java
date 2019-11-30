package com.example.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Connector{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void set(String txt) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentActivity f2 = (FragmentActivity) manager.findFragmentById(R.id.textfrag);
        f2.changeText(txt);
    }
}
