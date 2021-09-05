package com.example.mysunflower.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.mysunflower.R;
import com.example.mysunflower.databinding.ActivityGardenBinding;

public class GardenActivity extends AppCompatActivity {
    ActivityGardenBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_garden);
    }
}