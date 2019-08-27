package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * class description:
 * author ywk
 * since 2019-08-25
 */
public class AQI {

    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}