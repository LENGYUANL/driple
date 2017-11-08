package com.example.ll300.driple.shot_list;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ll300.driple.Base.BaseViewHolder;
import com.example.ll300.driple.R;

import butterknife.BindView;

/**
 * Created by ll300 on 2017/8/26.
 */

public class ShotViewHolder extends BaseViewHolder {

    @BindView(R.id.shot_clickable_cover) public View cover;
    @BindView(R.id.shot_view_count) public TextView viewCount;
    @BindView(R.id.shot_bucket_count) public TextView bucketCount;
    @BindView(R.id.shot_like_count) public TextView likeCount;
    @BindView(R.id.shot_image) public ImageView imageView;

    public ShotViewHolder(View itemView) {
        super(itemView);
    }
}
