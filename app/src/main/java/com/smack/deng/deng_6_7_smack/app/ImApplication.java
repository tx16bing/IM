package com.smack.deng.deng_6_7_smack.app;

import android.app.Application;

import com.orhanobut.logger.Logger;

/**
 * Created by deng on 2016/6/16.
 */
public class ImApplication extends Application{

    private static ImApplication mContext;
    private final String TAG = getClass().getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        // 初始化Logger
        Logger.init(TAG).setMethodCount(1).hideThreadInfo();

    }

    public static ImApplication getInstance(){
        return mContext;
    }

}
