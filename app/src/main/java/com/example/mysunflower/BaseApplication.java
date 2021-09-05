package com.example.mysunflower;

import android.app.Application;

import com.example.mysunflower.di.ApplicationComponent;
import com.example.mysunflower.di.DaggerApplicationComponent;

public class BaseApplication extends Application {
    ApplicationComponent applicationComponent = DaggerApplicationComponent.create();
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
