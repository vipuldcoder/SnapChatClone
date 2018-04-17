package com.example.android.snapchatclone.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by Vipul on 04-04-2018.
 */

public class SnapTabsView extends FrameLayout implements ViewPager.onPageChangeListener {
    public SnapTabsView(@NonNull Context context) {
        super(context);
    }

    public SnapTabsView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SnapTabsView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
