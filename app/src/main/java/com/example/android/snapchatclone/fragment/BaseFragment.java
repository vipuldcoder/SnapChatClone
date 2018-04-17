package com.example.android.snapchatclone.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Vipul on 04-04-2018.
 */

public abstract class BaseFragment extends Fragment {

    private View mRoot;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
            mRoot = inflater.inflate(getLayoutResId(), container, false);
            inOnCreateView(mRoot, container, savedInstanceState);
        return mRoot;
    }

    @LayoutRes
    public abstract int getLayoutResId();

    public abstract void inOnCreateView(View root, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState);
}
