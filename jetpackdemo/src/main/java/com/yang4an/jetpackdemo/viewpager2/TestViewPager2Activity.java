package com.yang4an.jetpackdemo.viewpager2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.yang4an.jetpackdemo.R;

public class TestViewPager2Activity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private TestViewPager2Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_view_pager2);
        initView();
    }

    private void initView() {
        viewPager2 = findViewById(R.id.viewpager2);
        adapter = new TestViewPager2Adapter(this);
        viewPager2.setAdapter(adapter);
        viewPager2.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
    }
}