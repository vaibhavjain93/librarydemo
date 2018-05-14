package com.example.librarydemo;

import android.util.Log;

public class LogUtils {

    private static final String TAG = "Library Demo";
    public void e(Throwable e) {
        Log.e(TAG,"This is an error",e);
    }
    public void d(String msg) {
        Log.i(TAG,msg);
    }
}
