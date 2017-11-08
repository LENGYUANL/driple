package com.example.ll300.driple.shot_list;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ll300.driple.Models.Shot;
import com.example.ll300.driple.R;

import java.util.List;

/**
 * Created by ll300 on 2017/8/26.
 */

class ShotListAdapter extends RecyclerView.Adapter{
    public List<Shot> data;

    public ShotListAdapter(List<Shot> data) {
        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_shot, parent, false);
        return new ShotViewHolder(view);
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Shot shot = data.get(position);

        ShotViewHolder shotviewholder = (ShotViewHolder) holder;
        shotviewholder.bucketCount.setText(String.valueOf(shot.buckets_count));
        shotviewholder.viewCount.setText(String.valueOf(shot.views_count));
        shotviewholder.likeCount.setText(String.valueOf(shot.likes_count));
        shotviewholder.imageView.setImageResource(R.drawable.shot_placeholder);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

}
