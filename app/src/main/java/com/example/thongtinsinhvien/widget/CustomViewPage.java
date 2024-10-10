package com.example.thongtinsinhvien.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

public class CustomViewPage extends ViewPager {
    private boolean enable;
    public CustomViewPage(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.enable = true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if(this.enable){
            return super.onTouchEvent(ev);
        }
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if(this.enable){
            return super.onInterceptTouchEvent(ev);
        }
        return false;
    }

    public void setPagingEnable(boolean enable){
        this.enable = enable;
    }
}
