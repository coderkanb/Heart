package com.kb.heart.fragment;


import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.gson.Gson;
import com.kb.heart.BaseFragment;
import com.kb.heart.R;
import com.kb.heart.bean.HomeMarqueeBean;
import com.kb.heart.client.ClientAPI;
import com.kb.heart.utils.ToastUtils;
import com.sunfusheng.marqueeview.MarqueeView;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

/**
 * 首页
 *
 * User: kanbin
 * Date: 2016/11/1
 */
public class HomePage extends BaseFragment {


    private ImageView mIvAnim1;
    private AnimationDrawable mAnim1;
    private MarqueeView mMarqueeView;

    public HomePage() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        layout = inflater.inflate(R.layout.fragment_home, container, false);
        return layout;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initView();
        setupView();
        loadData();
    }

    private void initView() {
        mMarqueeView = (MarqueeView) layout.findViewById(R.id.marqueeView);
    }

    private void setupView() {
    }

    private void loadData() {
        // 跑马灯
        ClientAPI.getHomeMarqueeData(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {
                ToastUtils.showShort(e.getMessage());
            }

            @Override
            public void onResponse(String response, int id) {
                if (response != null) {
                    Gson gson = new Gson();
                    HomeMarqueeBean homeMarqueeBean = gson.fromJson(response, HomeMarqueeBean.class);
                    if (homeMarqueeBean != null && "success".equals(homeMarqueeBean.getErrorStr())) {
                        List<HomeMarqueeBean.ResultsBean> results = homeMarqueeBean.getResults();
                        List<String> info = new ArrayList<>();
                        for (HomeMarqueeBean.ResultsBean rb : results) {
                            info.add(rb.getLabel());
                        }
                        mMarqueeView.startWithList(info);
                    }
                }
            }
        });
    }

    @Override
    public void widgetClick(View v) {

    }

}
