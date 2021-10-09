package com.moon.libsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.moon.mymodule.Module;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       String name= Module.name;
    }
}