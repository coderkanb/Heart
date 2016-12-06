package com.sesame.heart.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sesame.heart.BaseFragment;
import com.kb.heart.R;

/**
 * 咨询页
 *
 * User: kanbin
 * Date: 2016/11/1
 */
public class ConsultPage extends BaseFragment {


    public ConsultPage() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        layout = inflater.inflate(R.layout.fragment_consult, container, false);
        return layout;
    }

    @Override
    public void widgetClick(View v) {

    }

}
