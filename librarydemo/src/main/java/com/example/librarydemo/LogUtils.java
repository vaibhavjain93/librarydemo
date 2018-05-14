package com.example.librarydemo;

import android.util.Log;

public class LogUtils {

    private static final String TAG = "Library Demo";
    public static void e(Throwable e) {
        Log.e(TAG,"This is an error",e);
    }
    public static void d(String msg) {
        Log.i(TAG,msg);
    }
}
