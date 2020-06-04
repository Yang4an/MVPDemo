package com.yang4an.jetpackdemo.viewpager2;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yang4an.jetpackdemo.R;

/**
 * author: create by yangfan on 2020/6/1 5:46 PM
 * email: yang4an@gmail.com
 * description:
 * version:
 */
public class TestViewPager2Adapter extends RecyclerView.Adapter<TestViewPager2Adapter.ViewHolder> {

    private Context context;

    public TestViewPager2Adapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.test_viewpager2_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 3;
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
