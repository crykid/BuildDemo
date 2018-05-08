package com.example.blank.pgyerdemo.base;

import android.app.Application;

import com.bugtags.library.Bugtags;
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
        initPgyer();
    }

    final private void initPgyer() {
        PgyCrashManager.register(this);
        //在这里初始化
        Bugtags.start("3328b454706f21edb6a9a97661f8a866", this, Bugtags.BTGInvocationEventBubble);

    }
}
