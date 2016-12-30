package com.sesame.heart.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.kb.heart.R;
import com.ms.square.android.expandabletextview.ExpandableTextView;
import com.sesame.heart.bean.MindBean;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Administrator on 2016/12/23.
 */
public class MindRecyclerAdapter extends RecyclerView.Adapter<MindRecyclerAdapter.ViewHolder> {
    private Context mContext;
    private List<MindBean.ResultsBean> mList;

    public MindRecyclerAdapter(Context context, List<MindBean.ResultsBean> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_mind, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MindBean.ResultsBean itemBean = mList.get(position);
        if (itemBean != null) {
            String avatar = itemBean.getAvatar();
            if (!TextUtils.isEmpty(avatar)) {
                Glide.with(mContext).load(avatar).into(holder.ivAvatar);
            }
            holder.tvNickName.setText(itemBean.getNickname());
            holder.tvContent.setText(itemBean.getContent());
            holder.tvDate.setText(itemBean.getCreatedDateLabel());
            holder.tvViewCnt.setText(itemBean.getViewCnt());
            holder.tvLikeCnt.setText(itemBean.getLikeCnt());
            holder.tvCommentCnt.setText(itemBean.getCommentCnt());


            boolean isConsultant = "1".equals(itemBean.getIsConsultant());
            holder.tvNickName.setTextColor(mContext.getResources().getColor(isConsultant ? R.color.app_gold : R.color.app_blue));
        }
    }

    @Override
    public int getItemCount() {
        return mList != null ? mList.size() : 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private CircleImageView ivAvatar;
        private TextView tvNickName;
        private ExpandableTextView tvContent;
        private TextView tvDate;
        private TextView tvViewCnt;
        private TextView tvLikeCnt;
        private TextView tvCommentCnt;

        public ViewHolder(View itemView) {
            super(itemView);

            ivAvatar = (CircleImageView) itemView.findViewById(R.id.mind_item_avatar);
            tvNickName = (TextView) itemView.findViewById(R.id.mind_item_nickname);
            tvContent = (ExpandableTextView) itemView.findViewById(R.id.mind_item_content);
            tvDate = (TextView) itemView.findViewById(R.id.mind_item_date);
            tvViewCnt = (TextView) itemView.findViewById(R.id.mind_item_viewCnt);
            tvLikeCnt = (TextView) itemView.findViewById(R.id.mind_item_likeCnt);
            tvCommentCnt = (TextView) itemView.findViewById(R.id.mind_item_commentCnt);
        }
    }
}
