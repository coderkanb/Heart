package com.sesame.heart.callback;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.internal.$Gson$Types;
import com.sesame.heart.bean.BaseBean;
import com.zhy.http.okhttp.callback.Callback;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import okhttp3.Call;
import okhttp3.Response;

/**
 * 将服务器返回的数据转换成接口需要的参数类型
 *
 * Created by Admin on 2016/12/8.
 */
public abstract class DataCallback<T> extends Callback {
    public static final String TAG = DataCallback.class.getSimpleName();

    private Context mContext;
    private Type mType;

    public DataCallback(Context context){
        this.mContext = context;
        mType = getSuperclassTypeParameter(getClass());
    }

    private static Type getSuperclassTypeParameter(Class<?> subclass)
    {
        Type superclass = subclass.getGenericSuperclass();
        if (superclass instanceof Class)
        {
            throw new RuntimeException("Missing type parameter.");
        }
        ParameterizedType parameterized = (ParameterizedType) superclass;
        return $Gson$Types.canonicalize(parameterized.getActualTypeArguments()[0]);
    }

    @Override
    public T parseNetworkResponse(Response response, int id) throws Exception {
        if (response != null && !"[]".equals(response)) {
            Gson gson = new Gson();
            String str = response.body().string();
            T t = gson.fromJson(str, mType);

            BaseBean baseBean = (BaseBean) t;
            baseBean.code = response.code();
            baseBean.desc = str;
            return t;
        }
        return null;
    }

    @Override
    public void onResponse(Object response, int id) {
        onSuccess(response, id);
    }

    @Override
    public void onError(Call call, Exception e, int id) {
//        ToastUtils.showShort("onFail(), code= " + mCode + "\n" + e.getMessage());
        onFail(call, e, id);
    }

    protected abstract void onSuccess(Object response, int id);

    protected abstract void onFail(Call call, Exception e, int id);

    /**
     * 本来想拿到响应码，看来在请求失败的时候是不走parseNetworkResponse（）的
     * 看Okhttputils自带的StringCallback中复写的该方法，返回response.body().string()
     * 看OkHttpUtils源码，返回的e是带有响应code的，但没有响应内容string
     */
}
