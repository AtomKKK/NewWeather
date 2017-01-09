package com.qtking.weather.gson;

/**
 * Created by Think on 2017/1/9.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
        public String pm10;
        public String qlty;


    }
}
