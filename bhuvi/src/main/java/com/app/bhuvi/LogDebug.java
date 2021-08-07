package com.app.bhuvi;

import android.util.Log;

public class LogDebug {
    public static final String TAG = "SUPER_AWESOME_APP";

    public static void d(String message){
        Log.d(TAG,message);
    }
}
