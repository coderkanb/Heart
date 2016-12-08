package com.sesame.heart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;

import com.zhy.http.okhttp.OkHttpUtils;

/**
 * Created by Administrator on 2016/10/31.
 */
public abstract class BaseFragment extends Fragment implements View.OnClickListener{

    protected final String TAG = this.getClass().getSimpleName();

    protected View layout;

    private boolean isDebug;
    private String APP_NAME;
//    private View mContextView = null;
    private long lastClick = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        isDebug = MainApplication.isDebug;
        APP_NAME = MainApplication.APP_NAME;
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        mContextView = inflater.inflate(bindLayout(), container, false);
//        initView(mContextView);
//        doBusiness(getActivity());
//        return mContextView;
//    }

    /**
     * [绑定布局]
     *
     * @return
     */
//    public abstract int bindLayout();

    /**
     * [初始化控件]
     *
     * @param view
     */
//    public abstract void initView(final View view);

    /**
     * [业务操作]
     *
     * @param mContext
     */
//    public abstract void doBusiness(Context mContext);

    /** View点击 **/
    public abstract void widgetClick(View v);

    @Override
    public void onClick(View v) {
        if (!fastClick())
            widgetClick(v);
    }

    @SuppressWarnings("unchecked")
    public <T extends View> T $(View view, int resId) {
        return (T) view.findViewById(resId);
    }

    /**
     * [日志输出]
     *
     * @param msg
     */
    protected void $Log(String msg) {
        if (isDebug) {
            Log.d(APP_NAME, msg);
        }
    }


    /**
     * [页面跳转]
     *
     * @param clz
     */
    public void startActivity(Class<?> clz) {
        startActivity(clz, null);
    }

    /**
     * [携带数据的页面跳转]
     *
     * @param clz
     * @param bundle
     */
    public void startActivity(Class<?> clz, Bundle bundle) {
        Intent intent = new Intent();
        intent.setClass(getContext(), clz);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }


    /**
     * [含有Bundle通过Class打开编辑界面]
     *
     * @param cls
     * @param bundle
     * @param requestCode
     */
    public void startActivityForResult(Class<?> cls, Bundle bundle,
                                       int requestCode) {
        Intent intent = new Intent();
        intent.setClass(getContext(), cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivityForResult(intent, requestCode);
    }

    /**
     * [防止快速点击]
     *
     * @return
     */
    private boolean fastClick() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastClick <= 1000) {
            return true;
        }
        lastClick = currentTime;
        return false;
    }

    @Override
    public void onDestroy() {
        OkHttpUtils.getInstance().cancelTag(this);
        super.onDestroy();
    }
}
