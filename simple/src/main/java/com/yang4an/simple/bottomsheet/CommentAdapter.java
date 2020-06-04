package com.yang4an.simple.bottomsheet;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yang4an.simple.R;

/**
 * author: create by yangfan on 2020/5/22 9:53 AM
 * email: yang4an@gmail.com
 * description:
 * version:
 */
public class CommentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private LayoutInflater layoutInflater;

    public CommentAdapter(Context context) {
        layoutInflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.comment_recyclerview_list_item, parent,false);
        CommentVH vh = new CommentVH(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 100;
    }

    class CommentVH extends RecyclerView.ViewHolder {

        public CommentVH(@NonNull View itemView) {
            super(itemView);
        }
    }
}
