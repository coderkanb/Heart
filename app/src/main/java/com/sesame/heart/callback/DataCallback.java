package com.sesame.heart.callback;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.internal.$Gson$Types;
import com.zhy.http.okhttp.callback.Callback;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import okhttp3.Response;

/**
 * 将服务器返回的数据转换成接口需要的参数类型
 *
 * Created by kanbin on 2016/12/8.
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
            return t;
        }
        return null;
    }
}
