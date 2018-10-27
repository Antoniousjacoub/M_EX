package com.example.antonio.mtrek.adapters;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.antonio.mtrek.fragment.DirectOrdersFragment;
import com.example.antonio.mtrek.fragment.StaticOrdersFragment;

/**
 * Created by antonio on 10/26/18.
 */

public class RegisterPackagePagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;
    Activity activity;

    public RegisterPackagePagerAdapter(Activity activity, FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
        this.activity = activity;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new DirectOrdersFragment();

            case 1:
                return new DirectOrdersFragment();
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

    public Fragment getActiveFragment(ViewPager container, int position, FragmentManager mFragmentManager) {
        String name = makeFragmentName(container.getId(), position);
        return mFragmentManager.findFragmentByTag(name);
    }


    private String makeFragmentName(int viewId, int index) {
        return "android:switcher:" + viewId + ":" + index;
    }
}

