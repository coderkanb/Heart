package com.kb.heart.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kb.heart.BaseFragment;
import com.kb.heart.R;

/**
 * 群组页
 *
 * User: kanbin
 * Date: 2016/10/31
 */
public class GroupPage extends BaseFragment {


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
    public int bindLayout() {
        return R.layout.fragment_group;
    }

    @Override
    public void initView(View view) {

    }

    @Override
    public void doBusiness(Context mContext) {

    }

    @Override
    public void widgetClick(View v) {

    }

}
