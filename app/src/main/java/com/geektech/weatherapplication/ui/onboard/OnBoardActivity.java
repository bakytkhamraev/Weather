package com.geektech.weatherapplication.ui.onboard;


import android.os.Bundle;
import android.widget.Toolbar;

import com.geektech.weatherapplication.R;
import com.geektech.weatherapplication.ui.base.BaseActivity;

public class OnBoardActivity extends BaseActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board);

        /*setupViews();
        setupToolbar();*/
    }

    /*private void setupToolbar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }


    private void setupViews() {
        toolbar = findViewById(R.id.toolbar);
    }*/
}
