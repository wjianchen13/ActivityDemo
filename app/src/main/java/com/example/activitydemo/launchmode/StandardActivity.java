package com.example.activitydemo.launchmode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.activitydemo.R;

public class StandardActivity extends AppCompatActivity {

    private TextView tv_desc;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);
        tv_desc = findViewById(R.id.tv_desc);
        tv_desc.setText(this.toString() + "\ncurrent task id: " + this.getTaskId());
    }

    public void onStart(View v) {
        startActivity(new Intent(this, StandardActivity.class));
    }
    
}