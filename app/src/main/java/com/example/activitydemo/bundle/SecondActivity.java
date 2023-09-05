package com.example.activitydemo.bundle;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
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

    public void onTest2(View v) {
        Intent it = getIntent();
        if (it != null) {
            Member member = (Member)it.getSerializableExtra("member");
            if(member != null && member.getList() != null && member.getList().size() > 0) {
                System.out.println("========================> member size: " + member.getList().size());
            }
        }
    }

    public void onTest3(View v) {
        String str = SpUtils.getString("first_data");
        if(!TextUtils.isEmpty(str)) {
            Member member = CommonGsonUtils.fromJson(str, Member.class);
            if(member != null && member.getList() != null && member.getList().size() > 0) {
                System.out.println("========================> member size: " + member.getList().size());
            }
        }
    }

}