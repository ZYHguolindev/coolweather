package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * city:城市名
 * id 城市对应的天气id
 * loc 天气的更新时间
 * @SerializedName() 使用原因：
 * 一些字段不太适合直接作为Java字段来命名，因为使用@SerializedName注解的方式让JSON字段和Java字段之间建立映射关系
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }

}
