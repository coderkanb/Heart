package com.sesame.heart.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sesame.heart.BaseFragment;
import com.kb.heart.R;
import com.sesame.heart.activity.MallActivity;

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
                startActivity(MallActivity.class);
                break;

        }
    }

}
