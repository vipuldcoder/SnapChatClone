package com.example.android.snapchatclone.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.snapchatclone.R;

/**
 * Created by Vipul on 04-04-2018.
 */

public class StoryFragment extends BaseFragment {

    public static StoryFragment create() {
        return new StoryFragment();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_story;
    }

    @Override
    public void inOnCreateView(View root, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

    }
}
