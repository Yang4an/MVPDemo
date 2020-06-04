package com.yang4an.simple;

import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

/**
 * author: create by yangfan on 2020/5/22 2:04 PM
 * email: yang4an@gmail.com
 * description:
 * version:
 */
public abstract class BaseActivity2 extends AppCompatActivity {

    private GestureDetector mGestureDetector;
    protected static final float FLIP_DISTANCE = 50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        //1 初始化  手势识别器
        mGestureDetector = new GestureDetector(this, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
                                   float velocityY) {// e1: 第一次按下的位置   e2   当手离开屏幕 时的位置  velocityX  沿x 轴的速度  velocityY： 沿Y轴方向的速度
                if (e1.getX() - e2.getX() > FLIP_DISTANCE) {
                    Log.i("MYTAG", "向左滑...");
                    next(null);
                    return true;
                }
                if (e2.getX() - e1.getX() > FLIP_DISTANCE) {
                    Log.i("MYTAG", "向右滑...");
                    pre(null);

                    return true;
                }
                if (e1.getY() - e2.getY() > FLIP_DISTANCE) {
                    Log.i("MYTAG", "向上滑...");
                    return true;
                }
                if (e2.getY() - e1.getY() > FLIP_DISTANCE) {
                    Log.i("MYTAG", "向下滑...");
                    return true;
                }
                return false;
            }
        });

    }

    /**
     * 下一个页面
     *
     * @param view
     */
    public abstract void next(View view);

    /**
     * 上一个页面
     *
     * @param view
     */
    public abstract void pre(View view);

    //重写activity的触摸事件
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //2.让手势识别器生效
        mGestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

}