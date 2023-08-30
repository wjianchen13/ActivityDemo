package com.example.activitydemo.bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.activitydemo.R;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private ArrayList<User> users;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onTest1(View v) {
        Intent it = getIntent();
        if (it != null) {
            users = it.getParcelableArrayListExtra("test");
            if(users != null && users.size() > 0) {
                System.out.println("========================> users size: " + users.size());
            }
        }
    }
    
}