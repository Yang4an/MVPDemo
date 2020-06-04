package com.yang4an.library.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.yang4an.library.R;

/**
 * author: create by yangfan on 2020-04-16 09:53
 * email: yang4an@gmail.com
 * description:
 * version:
 */
public class CustomAvatarView extends FrameLayout {


    private int avatarWidth;
    private int avatarHeight;
    private Drawable avatarDrawable;
    private int attestationWidth;
    private int attestationHeight;
    private Drawable attestationDrawable;

    private ImageView avatarImageView;
    private ImageView attestationImageView;


    public CustomAvatarView(@NonNull Context context) {
        this(context, null);
    }

    public CustomAvatarView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomAvatarView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

//        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomAvatarView);
//        avatarWidth = typedArray.getInteger(R.styleable.CustomAvatarView_avatarWidth, 0);
//        avatarHeight = typedArray.getInteger(R.styleable.CustomAvatarView_avatarHeight, 0);
//        attestationWidth = typedArray.getInteger(R.styleable.CustomAvatarView_attestationWidth, 0);
//        attestationHeight = typedArray.getInteger(R.styleable.CustomAvatarView_attestationHeight, 0);
//
//        typedArray.recycle();

        init(context);
    }

    private void init(Context context) {

        //头像
        avatarImageView = new ImageView(context);
        LayoutParams avatarParams = new LayoutParams(avatarWidth, avatarHeight);
        avatarParams.gravity = Gravity.CENTER;
        avatarImageView.setLayoutParams(avatarParams);
        avatarImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        avatarImageView.setImageResource(R.drawable.ic_launcher_round);

        //认证框
        attestationImageView = new ImageView(context);
        LayoutParams attestationParams = new LayoutParams(attestationWidth, attestationHeight);
        attestationParams.gravity = Gravity.CENTER;
        attestationImageView.setLayoutParams(attestationParams);
        attestationImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        attestationImageView.setImageResource(R.drawable.v_instered_circle_border_img);

        this.addView(avatarImageView);
        this.addView(attestationImageView);

    }
}
