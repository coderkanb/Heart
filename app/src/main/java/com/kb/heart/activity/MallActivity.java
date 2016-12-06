package com.kb.heart.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.kb.heart.BaseActivity;
import com.kb.heart.R;
import com.kb.heart.utils.L;
import com.kb.heart.utils.ToastUtils;

/**
 * 练习页
 *
 * User: kanbin
 * Date: 2016/11/1
 */
public class MallActivity extends BaseActivity {

    // 身份认证
    private TextView mTvPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mall);

        initView();
        setupView();
    }

    private void initView() {
        mTvPerson = (TextView) findViewById(R.id.mall_tv_personal_info_verification);
    }

    private void setupView() {
        mTvPerson.setOnClickListener(this);
    }

    @Override
    public void initParams(Bundle params) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_mall;
    }

    @Override
    public void widgetClick(View v) {
        switch (v.getId()) {
            case R.id.mall_tv_personal_info_verification: // 身份认证
                break;

        }
    }
}
