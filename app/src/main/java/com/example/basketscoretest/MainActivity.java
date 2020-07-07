package com.example.basketscoretest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.basketscoretest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    MyViewModel myViewModel;
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        activityMainBinding.setData(myViewModel);
        activityMainBinding.setLifecycleOwner(this);
    }
}