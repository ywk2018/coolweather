package com.example.coolweather.util;


import okhttp3.OkHttpClient;
import okhttp3.Request;


/**
 * class description:
 * author ywk
 * since 2019-08-19
 */
public class HttpUtil {
    public static void sendOkHttpRequset(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}