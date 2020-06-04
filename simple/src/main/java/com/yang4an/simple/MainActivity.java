package com.yang4an.simple;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.yang4an.simple.bottomsheet.TestBottomSheetDialogActivity;
import com.yang4an.simple.view.GrayFrameLayout;

public class MainActivity extends AppCompatActivity {

    protected static final float FLIP_DISTANCE = 50;
    GestureDetector mDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDetector = new GestureDetector(this, new GestureDetector.OnGestureListener() {

            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public void onShowPress(MotionEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public void onLongPress(MotionEvent e) {
                // TODO Auto-generated method stub

            }

            /**
             *
             * e1 The first down motion event that started the fling. e2 The
             * move motion event that triggered the current onFling.
             */
            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                if (e1.getX() - e2.getX() > FLIP_DISTANCE) {
                    Log.i("MYTAG", "向左滑...");
//                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
//                    startActivity(intent);
                    return true;
                }
                if (e2.getX() - e1.getX() > FLIP_DISTANCE) {
                    Log.i("MYTAG", "向右滑...");
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

                Log.d("TAG", e2.getX() + " " + e2.getY());

                return false;
            }

            @Override
            public boolean onDown(MotionEvent e) {
                // TODO Auto-generated method stub
                return false;
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return mDetector.onTouchEvent(event);
    }


    public void doGetContact(View view) {
        startActivity(new Intent(this, TestBottomSheetDialogActivity.class));
//        startActivity(new Intent(this, SwipeMainActivity.class));

//        GrayFrameLayout grayFrameLayout= findViewById(R.id.gray_view);
//        grayFrameLayout.setViewGray(false);
    }

    public void doGetSms(View view) {
        GrayFrameLayout grayFrameLayout = findViewById(R.id.gray_view);
        grayFrameLayout.setViewGray(true);
    }


    private  void test(){

    }
//
//    @Override
//    public View onCreateView(String name, Context context, AttributeSet attrs) {
//        try {
//            if ("FrameLayout".equals(name)) {
//                int count = attrs.getAttributeCount();
//                for (int i = 0; i < count; i++) {
//                    String attributeName = attrs.getAttributeName(i);
//                    String attributeValue = attrs.getAttributeValue(i);
//                    if (attributeName.equals("id")) {
//                        int id = Integer.parseInt(attributeValue.substring(1));
//                        String idVal = getResources().getResourceName(id);
//                        if ("android:id/content".equals(idVal)) {
//                            GrayFrameLayout grayFrameLayout = new GrayFrameLayout(context, attrs);
////                            grayFrameLayout.setWindow(getWindow());
//                            return grayFrameLayout;
//                        }
//                    }
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return super.onCreateView(name, context, attrs);
//    }

}
