package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * class description:
 * author ywk
 * since 2019-08-25
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("text")
        public String info;
    }
}