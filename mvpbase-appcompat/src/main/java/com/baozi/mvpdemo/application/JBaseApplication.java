package com.baozi.mvpdemo.application;

import android.app.Application;
import android.content.Context;

import com.zhy.autolayout.utils.AutoUtils;

/**
 * Created by baozi on 2017/3/8.
 */
public class JBaseApplication extends Application {
    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }
}