package com.example.activitydemo.fragment;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.activitydemo.R;

/**
 * 底部tab切换Fragment
 */
public class TestFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_fragment);
    }

    /**
     * 添加fragment
     * @param v
     */
    public void onTest1(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.flyt_fragment, new TestFragment(), TestFragment.TAG);
        fragmentTransaction.commitAllowingStateLoss();
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