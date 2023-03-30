package com.example.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.activitydemo.fragment_base.FragmentBaseActivity;
import com.example.activitydemo.launchmode.LaunchModeMainActivity;
import com.example.activitydemo.viewpager.ViewPagerActivity;
import com.example.activitydemo.viewpager2.ViewPager2Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Activity启动模式
     * @param v
     */
    public void onTest1(View v) {
        startActivity(new Intent(this, LaunchModeMainActivity.class));
    }

    /**
     * fragment生命周期
     * @param v
     */
    public void onTest2(View v) {
        startActivity(new Intent(this, FragmentBaseActivity.class));
    }

    /**
     * viewpager
     * @param v
     */
    public void onTest3(View v) {
        startActivity(new Intent(this, ViewPagerActivity.class));
    }

    /**
     * viewpager2基础使用
     * @param v
     */
    public void onTest4(View v) {
        startActivity(new Intent(this, ViewPager2Activity.class));
    }

}