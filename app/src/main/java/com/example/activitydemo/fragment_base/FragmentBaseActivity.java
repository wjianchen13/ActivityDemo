package com.example.activitydemo.fragment_base;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.activitydemo.R;
import com.example.activitydemo.launchmode.LaunchModeMainActivity;

public class FragmentBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_base);
    }

    /**
     * Activity启动模式
     * @param v
     */
    public void onTest1(View v) {
        startActivity(new Intent(this, LaunchModeMainActivity.class));
    }

}