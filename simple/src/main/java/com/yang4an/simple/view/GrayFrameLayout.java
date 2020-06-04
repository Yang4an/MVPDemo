package com.yang4an.simple.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;

/**
 * author: create by yangfan on 2020/5/19 5:28 PM
 * email: yang4an@gmail.com
 * description: 黑白化View
 * version:
 */

public class GrayFrameLayout extends FrameLayout {


    private static final String TAG = "GrayFrameLayout";


    private Paint mPaint = new Paint();

    public GrayFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 设置视图黑白化
     *
     * @param isChange
     */
    public void setViewGray(boolean isChange) {
        if (isChange) {
            ColorMatrix cm = new ColorMatrix();
            cm.setSaturation(0);
            mPaint.setColorFilter(new ColorMatrixColorFilter(cm));
        } else {
            ColorMatrix cm = new ColorMatrix();
            cm.setSaturation(1);
            mPaint.setColorFilter(new ColorMatrixColorFilter(cm));
        }
        postInvalidate();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        canvas.saveLayer(null, mPaint, Canvas.ALL_SAVE_FLAG);
        super.dispatchDraw(canvas);
        canvas.restore();
        Log.e(TAG, "dispatchDraw: ");

    }


    @Override
    public void draw(Canvas canvas) {
        canvas.saveLayer(null, mPaint, Canvas.ALL_SAVE_FLAG);
        super.draw(canvas);
        canvas.restore();
        Log.e(TAG, "draw: ");

    }

}
