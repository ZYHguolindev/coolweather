package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

//采用OkHttp与服务器进行通信
public class HttpUtil {
    //与服务器进行交互发起一条http请求只需要调用sendOkHttpRequest()即可
    //传入要请求的地址，注册一个回调来处理服务器的响应
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();  //创建OkHttpClient实例
        Request request = new Request.Builder().url(address).build();  //发Http请求，需要创建一个Request对象
        client.newCall(request).enqueue(callback);  //调用OkHttpClient的newCall()方法出创建一个Call对象，调用execute方法发送请求并获取服务器返回的数据
    }
}
