package com.example.blank.pgyerdemo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.pgyersdk.javabean.AppBean;
import com.pgyersdk.update.PgyUpdateManager;
import com.pgyersdk.update.UpdateManagerListener;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    TextView tvBuild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvBuild = findViewById(R.id.tv_main_build);


        tvBuild.setText(BuildConfig.APP_NAME + "\n" + BuildConfig.BUILD_TYPE);

        initPgyer();


//        PgyUpdateManager.register(MainActivity.this,
//                new UpdateManagerListener() {
//
//                    @Override
//                    public void onUpdateAvailable(final String result) {
//
//                        // 将新版本信息封装到AppBean中
//                        final AppBean appBean = getAppBeanFromString(result);
//                        Log.d(TAG, "onUpdateAvailable: " + appBean.getDownloadURL() + " ++++ " + appBean.getVersionName());
//                        new AlertDialog.Builder(MainActivity.this)
//                                .setTitle("更新")
//                                .setMessage("")
//                                .setNegativeButton(
//                                        "确定",
//                                        new DialogInterface.OnClickListener() {
//
//                                            @Override
//                                            public void onClick(
//                                                    DialogInterface dialog,
//                                                    int which) {
//                                                startDownloadTask(
//                                                        MainActivity.this,
//                                                        appBean.getDownloadURL());
//                                            }
//                                        }).show();
//                    }
//
//                    @Override
//                    public void onNoUpdateAvailable() {
//                    }
//                });
    }

    private void initPgyer() {
        if (BuildConfig.BUILD_TYPE.equals("env_test")) {
            PgyUpdateManager.setIsForced(true); //设置是否强制更新。true为强制更新；false为不强制更新（默认值）。
            PgyUpdateManager.register(this);


        }
    }
}
