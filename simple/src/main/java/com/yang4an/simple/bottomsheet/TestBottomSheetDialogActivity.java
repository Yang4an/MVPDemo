package com.yang4an.simple.bottomsheet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yang4an.simple.BaseActivity2;
import com.yang4an.simple.R;
import com.yang4an.simple.contact.GetContactActivity;

public class TestBottomSheetDialogActivity extends BaseActivity2 {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_bottom_sheet);
    }

    @Override
    public void next(View view) {
        startActivity(new Intent(this, GetContactActivity.class));
    }

    @Override
    public void pre(View view) {
        finish();
    }


    public void showDialog(View view) {
        MyBottomSheetDialog dialog = new MyBottomSheetDialog();
        dialog.show(getSupportFragmentManager(), "");
    }
}
