package com.example.logutillib;

import android.util.Log;

public class LogDebug {

    private static final String TAG = "TEST_APP";

    public static void d(String message){
        Log.d(TAG, message);
    }
}
