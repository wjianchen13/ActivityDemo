package com.example.activitydemo.bundle;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.activitydemo.R;

import org.json.JSONObject;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SpUtils.setContext(this);
        setContentView(R.layout.activity_first);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SpUtils.setContext(null);
    }

    /**
     * android.os.TransactionTooLargeException: data parcel size 963020 bytes
     * @param v
     */
    public void onTest1(View v) {
        Intent it = new Intent(this, SecondActivity.class);
        Bundle bd = new Bundle();
        bd.putParcelableArrayList("test", getUsers());
        it.putExtras(bd);
        startActivity(it);
    }

    public void onTest2(View v) {
        getUsers();
    }

    private ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        int size = 0;
        for(int i = 0; i < 10000; i ++) {
            User myParcelable = new User(); // 假设有一个自定义的 Parcelable 对象
            Parcel parcel = Parcel.obtain();
            myParcelable.writeToParcel(parcel, 0);

            int parcelSize = parcel.dataSize();
            System.out.println("=========================> parcelSize: " + parcelSize);
            size += parcelSize;
            parcel.recycle();
            users.add(myParcelable);
        }


        System.out.println("=========================> size: " + size);
        return users;
    }

    /**
     * Caused by: android.os.TransactionTooLargeException: data parcel size 1100792 bytes
     * @param v
     */
    public void onTest3(View v) {
        Intent it = new Intent(this, SecondActivity.class);
        Bundle bd = new Bundle();
        Member member = new Member(getMember());
        bd.putSerializable("member", member);
        it.putExtras(bd);
        startActivity(it);
    }

    private String json;

    public void onTest4(View v) {
        Member member = new Member(getMember());
        json = CommonGsonUtils.toJson(member);
    }

    public void onTest5(View v) {
        SpUtils.commitString("first_data", json, new SpUtils.ISpListener() {
            @Override
            public void onCommit(boolean success) {
                if(success) {
                    Intent it = new Intent(FirstActivity.this, SecondActivity.class);
                    Bundle bd = new Bundle();
                    it.putExtras(bd);
                    startActivity(it);
                }
            }
        });
    }

    private ArrayList<User> getMember() {
        ArrayList<User> users = new ArrayList<>();
        int size = 0;
        for(int i = 0; i < 1000000; i ++) {
            User myParcelable = new User();
            users.add(myParcelable);
        }

        System.out.println("=========================> member size: " + SizeCalculator.calcSize(users));
        return users;
    }
    
}