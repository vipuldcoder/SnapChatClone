package com.example.android.snapchatclone.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.snapchatclone.fragment.ChatFragment;
import com.example.android.snapchatclone.fragment.EmptyFragment;
import com.example.android.snapchatclone.fragment.StoryFragment;

/**
 * Created by Vipul on 04-04-2018.
 */

public class MainPagerAdapter extends FragmentPagerAdapter {

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ChatFragment.create();
            case 1:
                return EmptyFragment.create();
            case 2:
                return StoryFragment.create();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
