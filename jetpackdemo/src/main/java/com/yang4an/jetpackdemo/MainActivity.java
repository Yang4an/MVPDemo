package com.yang4an.jetpackdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yang4an.jetpackdemo.viewpager2.TestViewPager2Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doTestVP(View view) {
        startActivity(new Intent(this, TestViewPager2Activity.class));
    }
}
