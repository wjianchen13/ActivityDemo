package com.example.activitydemo.height;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.activitydemo.R;
import com.example.activitydemo.fragment.TestFragment;

/**
 * Fragment显示一定高度布局
 */
public class HeightFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height_fragment);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.flyt_fragment, new HeightFragment(), TestFragment.TAG);
        fragmentTransaction.commitAllowingStateLoss();
    }

    /**
     * 添加fragment
     * @param v
     */
    public void onTest1(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.flyt_fragment, new HeightFragment(), TestFragment.TAG);
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