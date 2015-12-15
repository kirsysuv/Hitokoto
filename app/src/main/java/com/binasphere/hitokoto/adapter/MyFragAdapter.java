package com.binasphere.hitokoto.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.binasphere.hitokoto.frag.FragmentFactory;

/**
 * Created by Kerstin on 2015/12/15.
 */
public class MyFragAdapter extends FragmentPagerAdapter {
    private static String[] title=new String []{"首页","手气不错"};
    public MyFragAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public Fragment getItem(int position) {
        return FragmentFactory.getFragment(position);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
