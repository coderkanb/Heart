package com.sesame.heart;

import android.graphics.drawable.AnimationDrawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import com.kb.heart.R;
import com.sesame.heart.fragment.ConsultPage;
import com.sesame.heart.fragment.DynamicPage;
import com.sesame.heart.fragment.GroupPage;
import com.sesame.heart.fragment.HomePage;

public class MainActivity extends BaseActivity {

    private RadioButton mController0;
    private RadioButton mController1;
    private RadioButton mController2;
    private RadioButton mController3;

    private RadioButton[] mTabs;
    private int index;
    private int currentTabIndex;
    private android.support.v4.app.Fragment[] fragments;
    private FragmentManager fm;
    private HomePage mHomePage;
    private ConsultPage mConsultPage;
    private GroupPage mGroupPage;
    private DynamicPage mDynamicPage;

    private long mExitTime;

    // 底部动画
    private ImageView mIvAnim1;
    private AnimationDrawable mAnim1;
    private ImageView mIvAnim2;
    private AnimationDrawable mAnim2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setupView();
        initAnim();
    }

    private void initView() {
        mController0 = (RadioButton) findViewById(R.id.controller_zero);
        mController1 = (RadioButton) findViewById(R.id.controller_one);
        mController2 = (RadioButton) findViewById(R.id.controller_two);
        mController3 = (RadioButton) findViewById(R.id.controller_three);

        mTabs = new RadioButton[4];
        mTabs[0] = mController0;
        mTabs[1] = mController1;
        mTabs[2] = mController2;
        mTabs[3] = mController3;
    }

    @Override
    public void initParams(Bundle params) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_main;
    }

//    @Override
//    public void initView(View view) {
//        mController0 = (RadioButton) view.findViewById(R.id.controller_zero);
//        mController1 = (RadioButton) view.findViewById(R.id.controller_one);
//        mController2 = (RadioButton) view.findViewById(R.id.controller_two);
//        mController3 = (RadioButton) view.findViewById(R.id.controller_three);
//
//        mTabs = new RadioButton[4];
//        mTabs[0] = mController0;
//        mTabs[1] = mController1;
//        mTabs[2] = mController2;
//        mTabs[3] = mController3;
//    }

    private void setupView() {
        fm = getSupportFragmentManager();

        mHomePage = new HomePage();
        mConsultPage = new ConsultPage();
        mGroupPage = new GroupPage();
        mDynamicPage = new DynamicPage();

        fragments = new Fragment[]{mHomePage, mConsultPage, mGroupPage, mDynamicPage};

        fm.beginTransaction().add(R.id.container,mHomePage, mHomePage.TAG)
                .add(R.id.container, mConsultPage, mConsultPage.TAG).hide(mConsultPage)
//                .add(R.id.container, mGroupPage, mGroupPage.TAG).hide(mGroupPage)
//                .add(R.id.container, mDynamicPage, mDynamicPage.TAG).hide(mDynamicPage)
                .show(mHomePage)
                .commit();

    }

    @Override
    public void widgetClick(View v) {
        switch (v.getId()) {
        }
    }

    public void onTabClick(View view) {

        switch (view.getId()) {
            case R.id.controller_zero:
                index = 0;
                break;
            case R.id.controller_one:
                index = 1;
                break;
            case R.id.controller_two:
                index = 2;
                break;
            case R.id.controller_three:
                index = 3;
                break;
        }

        if (currentTabIndex != index) {
            FragmentTransaction trx = getSupportFragmentManager().beginTransaction();
            trx.hide(fragments[currentTabIndex]);
            if (!fragments[index].isAdded()) {
                trx.add(R.id.container, fragments[index]);
            }
            trx.show(fragments[index]).commit();
        }

        mTabs[currentTabIndex].setChecked(false);
        // 把当前tab设为选中状态
        mTabs[index].setChecked(true);
        currentTabIndex = index;

    }

    private void initAnim() {
        mIvAnim1 = (ImageView) findViewById(R.id.main_iv_anim1);
        mAnim1 = (AnimationDrawable) mIvAnim1.getBackground();
        mIvAnim2 = (ImageView) findViewById(R.id.main_iv_anim2);
        mAnim2 = (AnimationDrawable) mIvAnim2.getBackground();

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            if ((System.currentTimeMillis()-mExitTime)>2000){
                Toast.makeText(this,"再按一次退出程序",Toast.LENGTH_SHORT).show();
                mExitTime = System.currentTimeMillis();
            }else {
                finish();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mAnim1.start();
        mAnim2.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mAnim1.stop();
        mAnim2.stop();
    }
}
