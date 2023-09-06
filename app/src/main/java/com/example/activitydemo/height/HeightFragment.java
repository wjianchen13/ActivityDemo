package com.example.activitydemo.height;


import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.activitydemo.R;

public class HeightFragment extends Fragment {

    public static final String TAG = HeightFragment.class.getSimpleName();

    private String LOG = "=============================> ";

    public HeightFragment() {
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(TAG, LOG + "onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, LOG + "onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, LOG + "onCreateView");
        View v = inflater.inflate(R.layout.fragment_height, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, LOG + "onActivityCreated");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, LOG + "onViewCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, LOG + "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, LOG + "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, LOG + "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, LOG + "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, LOG + "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, LOG + "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, LOG + "onDetach");
    }
}