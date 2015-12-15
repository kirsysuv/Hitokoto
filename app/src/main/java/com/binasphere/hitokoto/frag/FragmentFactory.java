package com.binasphere.hitokoto.frag;

import android.support.v4.app.Fragment;

/**
 * Created by Kerstin on 2015/12/15.
 */
public class FragmentFactory {
    public static Fragment getFragment(int position){
        switch (position){
            case 0:
                return HomeFragment.newInstance("","");
            case 1:
                return LuckFragment.newInstance("","");
        }
        return null;
    }
}
