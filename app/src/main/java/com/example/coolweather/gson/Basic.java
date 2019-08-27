package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * class description:
 * author ywk
 * since 2019-08-25
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;


    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}