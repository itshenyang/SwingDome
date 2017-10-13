package com.sy.snack.Utils;

import okhttp3.*;
import org.junit.Test;

import java.net.UnknownHostException;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/20.
 */
public class httpUtils {

    public static String okGet(String url) throws Exception {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");


    public static String post(String url, String json) throws Exception {
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    @Test
    public void min() throws Exception {

        L.w(okGet("http://hb.keruis.com:8080/KeruisCloudAPI/user/login"));
    }

    public static String WxPushReturnReulstState(String string) {
        Map map = (Map) JSONUtils.parse(string, Map.class);
        return (String) map.get("errmsg");
    }

    public static void okGetPlus(Exception e) {

        if (e.getCause() != null
                && e.getCause() instanceof UnknownHostException) {
            L.w("连接不上服务器，");
        }


    }

}
