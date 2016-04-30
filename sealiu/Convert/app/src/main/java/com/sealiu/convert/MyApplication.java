package com.sealiu.convert;

import android.app.Application;
import android.util.Log;

import com.baidu.apistore.sdk.ApiCallBack;
import com.baidu.apistore.sdk.ApiStoreSDK;
import com.baidu.apistore.sdk.network.Parameters;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        ApiStoreSDK.init(this, "6304bab88de954d7e67deb39d34b30c1");
        super.onCreate();
    }
}
