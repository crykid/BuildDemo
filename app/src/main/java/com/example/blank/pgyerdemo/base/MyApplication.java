package com.example.blank.pgyerdemo.base;

import android.app.Application;

import com.pgyersdk.crash.PgyCrashManager;

/**
 * Created by : blank
 * Created on : 2018/5/4 at 13:45
 * Description:
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PgyCrashManager.register(this);
    }
}
