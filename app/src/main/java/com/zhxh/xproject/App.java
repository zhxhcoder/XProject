package com.zhxh.xproject;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by zhxh on 2018/8/1
 */
public class App extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);

    }
}
