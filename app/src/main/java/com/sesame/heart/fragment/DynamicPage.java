package com.sesame.heart.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cjj.MaterialRefreshLayout;
import com.cjj.MaterialRefreshListener;
import com.sesame.heart.BaseFragment;
import com.kb.heart.R;
import com.sesame.heart.adapter.MindQuickAdapter;
import com.sesame.heart.adapter.MindRecyclerAdapter;
import com.sesame.heart.bean.MindBean;
import com.sesame.heart.client.Api4MindCircle;
import com.sesame.heart.client.BaseDataListener;
import com.sesame.heart.client.ClientAPIHelper;
import com.sesame.heart.utils.ToastUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.Call;

/**
 * 心理圈
 * <p/>
 * Created by sesame on 2016/12/8.
 */
public class DynamicPage extends BaseFragment {


    private RecyclerView mRecyclerView;
    private MaterialRefreshLayout mMaterialRefreshLayout;
    private List<MindBean.ResultsBean> mList;
//    private MindRecyclerAdapter mMindAdapter;
    private MindQuickAdapter mMindAdapter;
    private int page = 1;

    public DynamicPage() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        layout = inflater.inflate(R.layout.fragment_dynamic, container, false);
        return layout;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initVariable();
        initView();
        setupView();
        initCtrl();
        loadData();
    }

    private void initVariable() {
        mList = new ArrayList<>();
    }

    private void initView() {
        mRecyclerView = (RecyclerView) layout.findViewById(R.id.recyclerView);
        mMaterialRefreshLayout = (MaterialRefreshLayout) layout.findViewById(R.id.swipeRefreshLayout);
    }

    private void setupView() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mMaterialRefreshLayout.setMaterialRefreshListener(new MaterialRefreshListener() {
            @Override
            public void onRefresh(MaterialRefreshLayout materialRefreshLayout) {
                page = 1;
                loadData();
            }

            @Override
            public void onRefreshLoadMore(MaterialRefreshLayout materialRefreshLayout) {
                super.onRefreshLoadMore(materialRefreshLayout);
                page++;
                loadData();
            }
        });

    }

    private void initCtrl() {
//        mMindAdapter = new MindRecyclerAdapter(getContext(), mList);
//        mRecyclerView.setAdapter(mMindAdapter);

        mMindAdapter = new MindQuickAdapter(R.layout.item_mind, mList);
        mRecyclerView.setAdapter(mMindAdapter);
    }

    private void loadData() {
        Map<String, String> param = new HashMap<>();
        param.put("page", "" + page);
        Api4MindCircle api4MindCircle = (Api4MindCircle) ClientAPIHelper.getInstance().getClientAPI(Api4MindCircle.class);
        api4MindCircle.getMindList(param, new BaseDataListener<MindBean>() {
            @Override
            public void onFail(Call call, Exception e) {
                ToastUtils.showShort(e.getMessage());
                dismissLoadingDialog();
            }

            @Override
            public void onSuccess(MindBean entity) {
                if (entity != null) {
                    List<MindBean.ResultsBean> results = entity.getResults();

                    if (results != null && !results.isEmpty()) {
                        if (page == 1) {
                            mList.clear();
                        }
                        mList.addAll(results);
                        mMindAdapter.notifyDataSetChanged();
                    }
                }
                dismissLoadingDialog();
            }
        });

//        ClientAPI.getMindList(new StringCallback() {
//            @Override
//            public void onError(Call call, Exception e, int id) {
//                ToastUtils.showShort(e.getMessage());
//                dismissLoadingDialog();
//            }
//
//            @Override
//            public void onResponse(String response, int id) {
//                if (!TextUtils.isEmpty(response)) {
//                    Gson gson = new Gson();
//                    MindBean mindBean = gson.fromJson(response, MindBean.class);
//                    List<MindBean.ResultsBean> results = mindBean.getResults();
//
//                    if (results != null && !results.isEmpty()) {
//                        mList.clear();
//                        mList.addAll(results);
//                        mMindAdapter.notifyDataSetChanged();
//                    }
//                }
//
//                dismissLoadingDialog();
//            }
//        });
    }

    private void dismissLoadingDialog() {
        mMaterialRefreshLayout.finishRefresh();
        mMaterialRefreshLayout.finishRefreshLoadMore();
    }

    @Override
    public void widgetClick(View v) {

    }

}
