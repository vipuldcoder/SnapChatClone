package com.example.android.snapchatclone.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

import com.example.android.snapchatclone.R;

/**
 * Created by Vipul on 04-04-2018.
 */

public class ChatFragment extends BaseFragment {

    public static ChatFragment create() {
        return new ChatFragment();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_chat;
    }

    @Override
    public void inOnCreateView(View root, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

    }
}

