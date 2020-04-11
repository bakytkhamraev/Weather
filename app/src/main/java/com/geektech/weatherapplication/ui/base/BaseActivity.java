package com.geektech.weatherapplication.ui.base;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity  extends AppCompatActivity {


    protected void toast(String msg){
        Toast.makeText(this, "msg", Toast.LENGTH_SHORT).show();

    }
}
