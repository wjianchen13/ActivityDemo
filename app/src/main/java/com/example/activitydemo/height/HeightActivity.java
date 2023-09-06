package com.example.activitydemo.height;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.activitydemo.R;
import com.example.activitydemo.fragment.TestFragment;

/**
 * Activity显示一定高度布局
 * 项目使用autosize，导致Activity和Fragment设置同一个高度，但是实际显示却不一样
 */
public class HeightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height);
    }

    /**
     * 添加fragment
     * @param v
     */
    public void onTest1(View v) {
        startActivity(new Intent(this, HeightFragmentActivity.class));
    }

    /**
     * Fragment2
     * @param v
     */
    public void onTest2(View v) {

    }

    /**
     * Fragment3
     * @param v
     */
    public void onTest3(View v) {

    }

    /**
     * Fragment4
     * @param v
     */
    public void onTest4(View v) {

    }

    /**
     * Fragment5
     * @param v
     */
    public void onTest5(View v) {

    }

}