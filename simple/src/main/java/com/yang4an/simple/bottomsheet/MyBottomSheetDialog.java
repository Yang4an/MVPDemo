package com.yang4an.simple.bottomsheet;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yang4an.simple.R;

/**
 * create by libo
 * create on 2019/4/1
 * description
 */
public class MyBottomSheetDialog extends BaseBottomSheetDialog {


    private RecyclerView mRecyclerView;
    private CommentAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_comment, container);
        initView(view);
        return view;
    }

    private void initView(View view) {
        mRecyclerView = view.findViewById(R.id.comment_recicler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mAdapter = new CommentAdapter(getActivity());
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    protected int getHeight() {
        return getResources().getDisplayMetrics().heightPixels - 400;
    }
}
