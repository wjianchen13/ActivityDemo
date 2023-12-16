package com.example.activitydemo.bundle;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

import androidx.annotation.NonNull;

/**
 * 通过SP传递比较大的数据
 */
public class SpUtils {

    public static Context mContext;

    private static final String SETTING_NAME = "transform_data";


    public static void setContext(Context context) {
        mContext = context;
    }

    /**
     * 替换AppUser getSettings
     * @return
     */
    public static SharedPreferences getSharedPreferences() {
        return getSharedPreferences(SETTING_NAME);
    }

    public static SharedPreferences getSharedPreferences(String name) {
        return mContext != null ? mContext.getSharedPreferences(name, Context.MODE_PRIVATE) : null;
    }

    public static void putString(String key, String value) {
        putString(SETTING_NAME, key, value);
    }

    public static void putString(String name, String key, String val) {
        SharedPreferences sp = getSharedPreferences(name);
        SharedPreferences.Editor edit = sp.edit();
        if (edit != null){
            edit.putString(key, val);
            edit.apply();
        }
    }

    public static void commitString(String key, String value, ISpListener listener) {
        commitString(SETTING_NAME, key, value, listener);
    }

    public static void commitString(String name, String key, String val, ISpListener listener) {
        Handler handler = new Handler(Looper.getMainLooper()){
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                if(msg != null && msg.what == 1) {
                    boolean commit = (boolean)msg.obj;
                    if(listener != null) {
                        listener.onCommit(commit);
                    }
                }

            }
        };
        new Thread(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sp = getSharedPreferences(name);
                SharedPreferences.Editor edit = sp.edit();
                if (edit != null){
                    edit.putString(key, val);
                    boolean commit = edit.commit();
                    Message msg = handler.obtainMessage();
                    msg.what = 1;
                    msg.obj = commit;
                    handler.sendMessage(msg);
                }
            }
        }).start();

    }

    public static String getString(String key) {
        return getString(key, "");
    }

    public static String getString(String key, String defValue) {
        SharedPreferences sp = getSharedPreferences();
        return sp != null ? sp.getString(key, defValue) : defValue;
    }

    public static String getStringByName(String name, String key) {
        return getStringByName(name, key, "");
    }

    public static String getStringByName(String name, String key, String defValue) {
        SharedPreferences sp = getSharedPreferences(name);
        return sp != null ? sp.getString(key, defValue) : defValue;
    }

    public static interface ISpListener {
        void onCommit(boolean success);
    }


}
