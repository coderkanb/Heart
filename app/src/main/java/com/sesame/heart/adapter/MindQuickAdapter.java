package com.sesame.heart.adapter;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.kb.heart.R;
import com.ms.square.android.expandabletextview.ExpandableTextView;
import com.sesame.heart.bean.MindBean;

import java.util.List;

/**
 * Created by Administrator on 2016/12/30.
 */
public class MindQuickAdapter extends BaseQuickAdapter<MindBean.ResultsBean, BaseViewHolder> {
    public MindQuickAdapter(int layoutResId, List<MindBean.ResultsBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MindBean.ResultsBean itemBean) {
        if (itemBean != null) {
            String avatar = itemBean.getAvatar();
            if (!TextUtils.isEmpty(avatar)) {
                ImageView ivAvatar = helper.getView(R.id.mind_item_avatar);
                Glide.with(mContext).load(avatar).into(ivAvatar);
            }
            helper.setText(R.id.mind_item_nickname, itemBean.getNickname());
            ExpandableTextView tvContent = helper.getView(R.id.mind_item_content);
            tvContent.setText(itemBean.getContent());
            helper.setText(R.id.mind_item_date, itemBean.getCreatedDateLabel());
            helper.setText(R.id.mind_item_viewCnt, itemBean.getViewCnt());
            helper.setText(R.id.mind_item_likeCnt, itemBean.getLikeCnt());
            helper.setText(R.id.mind_item_commentCnt, itemBean.getCommentCnt());

            boolean isConsultant = "1".equals(itemBean.getIsConsultant());
            TextView tvNickName = helper.getView(R.id.mind_item_nickname);
            tvNickName.setTextColor(mContext.getResources().getColor(isConsultant ? R.color.app_gold : R.color.app_blue));
        }
    }
}
