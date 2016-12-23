package com.sesame.heart.client;

import android.content.Context;

import okhttp3.Call;


/**
 * 把网络数据的回调返回给Acitivity或者Fragment
 *
 * Created by sesame on 2016/12/8.
 */
public abstract class BaseDataListener<T> {

    public abstract void onFail(Call call, Exception e);
    public abstract void onSuccess(T entity);
    public void preDeal(Context context, T var1){
        this.onSuccess(var1);
    }

}
