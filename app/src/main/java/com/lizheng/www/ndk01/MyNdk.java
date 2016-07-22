package com.lizheng.www.ndk01;

/**
 * Created by 10648 on 2016/7/22 0022.
 */
public class MyNdk {

    static {
        System.loadLibrary("MyLibrary");
    }

    public native String getString(String str);
}