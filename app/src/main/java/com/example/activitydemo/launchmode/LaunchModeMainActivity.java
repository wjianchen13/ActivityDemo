package com.example.activitydemo.launchmode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.activitydemo.R;

public class LaunchModeMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_mode_main);
    }

    public void onStandard(View v) {
        startActivity(new Intent(this, StandardActivity.class));
    }

    public void onSingleTop(View v) {
        startActivity(new Intent(this, SingleTopActivity.class));
    }

    public void onSingleTask(View v) {
        startActivity(new Intent(this, SingleTaskActivity.class));
    }

    public void onSingleInstance(View v) {
        startActivity(new Intent(this, SingleInstanceActivity.class));
    }
}