package com.kb.heart.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kb.heart.BaseFragment;
import com.kb.heart.R;
import com.kb.heart.utils.ToastUtils;

/**
 * 群组页
 *
 * User: kanbin
 * Date: 2016/10/31
 */
public class GroupPage extends BaseFragment {

    // 商城入口
    private TextView mTvMall;

    public GroupPage() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        layout = inflater.inflate(R.layout.fragment_group, container, false);
        return layout;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        setupView();
    }

    private void initView() {
        mTvMall = (TextView) layout.findViewById(R.id.group_tv_mall);
    }

    private void setupView() {
        mTvMall.setOnClickListener(this);
    }

    @Override
    public void widgetClick(View v) {
        switch (v.getId()) {
            case R.id.group_tv_mall:
                ToastUtils.showShort("mall");
                break;

        }
    }

}
