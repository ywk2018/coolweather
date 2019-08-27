package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * class description:
 * author ywk
 * since 2019-08-25
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort Comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;


    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}