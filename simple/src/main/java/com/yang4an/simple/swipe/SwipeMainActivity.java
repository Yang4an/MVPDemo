package com.yang4an.simple.swipe;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.yang4an.simple.R;

/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: 主界面
 * Created by bushijie33@gmail.com on 2015/7/5.
 */
public class SwipeMainActivity extends ParallaxSwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_main);
        findViewById(R.id.next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeMainActivity.this, NextActivity.class);
                intent.putExtra("index", 0);
                startParallaxSwipeBackActivty(SwipeMainActivity.this, intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Uri uri = Uri.parse("https://github.com/bushijie/ParallaxSwipeBack");
            startActivity(new Intent(Intent.ACTION_VIEW, uri));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
