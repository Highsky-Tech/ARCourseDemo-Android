package com.highsky.ardemot;

import android.app.Application;

import com.highsky.artlibrary.ARSDKBase;

public class ARdemoApplication extends Application {

    private static ARdemoApplication ardemoApplication;

    public static ARdemoApplication getInstance() {
        if (ardemoApplication == null) {
            ardemoApplication = new ARdemoApplication();
        }
        return ardemoApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        ardemoApplication = this;

        ARSDKBase.getInstance().ARSDKBaseInit(this);
    }
}
