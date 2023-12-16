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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        TransactionData.clear();
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

    /**
     * 传递数据到另外的Activity 静态变量
     * @param v
     */
    public void onTest4(View v) {
        String str = TransactionData.mTestJson;
        if(!TextUtils.isEmpty(str)) {
            Member member = CommonGsonUtils.fromJson(str, Member.class);
            if(member != null && member.getList() != null && member.getList().size() > 0) {
                System.out.println("========================> member size: " + member.getList().size());
            }
        }
    }

    /**
     * 传递数据到另外的Activity 静态变量
     * @param v
     */
    public void onTest5(View v) {
        Member member = TransactionData.mMember;
        if(member != null && member.getList() != null && member.getList().size() > 0) {
            System.out.println("========================> member size: " + member.getList().size());
        }
    }

}