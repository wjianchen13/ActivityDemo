package com.example.activitydemo.launchmode;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.activitydemo.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletask);
    }
}