package com.kb.heart.client;

import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

/**
 * Created by Administrator on 2016/11/2.
 */
public class ClientAPI {

    /**
     * 获取首页跑马灯数据
     */
    public static void getHomeMarqueeData(StringCallback callback){
        OkHttpUtils.get()
                .url(HttpUrls.HOME_MARQUEE)
                .build().execute(callback);

    }


}
