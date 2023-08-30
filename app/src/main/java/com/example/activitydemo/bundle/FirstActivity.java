package com.example.activitydemo.bundle;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.activitydemo.R;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

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
    
}