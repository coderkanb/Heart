package com.sesame.heart.client;

import com.sesame.heart.bean.MindBean;
import com.sesame.heart.callback.DataCallback;

import java.util.Map;

import okhttp3.Call;

/**
 * 心理圈页网络请求
 *
 * Created by Administrator on 2016/12/23.
 */
public class Api4MindCircle extends BaseClientAPI {

    public void getMindList(Map<String, String> param, final BaseDataListener<MindBean> listener){
        doGet(HttpUrls.MIND_LIST, null,param, new DataCallback<MindBean>(mContext){

            @Override
            public void onError(Call call, Exception e, int id) {
                listener.onFail(call, e);
            }

            @Override
            public void onResponse(Object response, int id) {
                MindBean bean = (MindBean) response;
                listener.preDeal(mContext, bean);
            }
        });
    }
}
