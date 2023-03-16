package com.example.activitydemo.launchmode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.activitydemo.R;

public class SingleTopActivity extends AppCompatActivity {

    private TextView tvDesc;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletop);
        tvDesc = findViewById(R.id.tv_desc);
        tvDesc.setText(this.toString() + "\ncurrent task id: " + this.getTaskId());
    }

    public void onOther(View v) {
        startActivity(new Intent(this, OtherActivity.class));
    }

    public void onSingleTop(View v) {
        startActivity(new Intent(this, SingleTopActivity.class));
    }
    
}