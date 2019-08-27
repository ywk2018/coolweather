package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * class description:
 * author ywk
 * since 2019-08-25
 */
public class Forecast {

    public String date;
    @SerializedName("tmp")
    public Temperature Temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txd_d")
        public String info;
    }
}