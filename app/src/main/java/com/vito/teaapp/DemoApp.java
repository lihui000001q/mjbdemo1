package com.vito.teaapp;

import code.core.MainApplication;

public class DemoApp extends MainApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        //VestSDK.setLoggable(true);
    }

    @Override
    public String getConfigAsset() {
        //config-可以自定义文件名字，
        //demo\app\src\main\assets\config
        return "config";
    }
}
