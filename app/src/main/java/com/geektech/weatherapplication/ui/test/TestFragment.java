package com.geektech.weatherapplication.ui.test;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.geektech.weatherapplication.R;
import com.geektech.weatherapplication.ui.base.BaseFragment;

public class TestFragment extends BaseFragment {


    @Override
    protected int getViewLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        setupViews(view);
        setupListener();
    }

    private void setupListener() {
    }

    private void setupViews(View view) {
    }
}
