package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String status;  //成功返回ok  失败返回具体的原因
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    //因为daily_forecast中包含的是一个数组，因此使用List集合来引用Forecast类
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
