package com.example.tablayout;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class Pager extends FragmentStatePagerAdapter {
    // private  int tabcount;
    final List<Fragment> fragmentList = new ArrayList<>();
    final List<String> fragmentListTitles = new ArrayList<>();

    public Pager(FragmentManager fm) {
        super(fm);
        //  this.tabcount = tabcount;
    }


    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
//        switch (position) {
//            case 0:
//                fragment1 tab1 = new fragment1();
//                return tab1;
//            case 1:
//                fragment2 tab2 = new fragment2();
//                return tab2;
//            default:
//                return null;
//        }

    }

    @Override
    public int getCount() {
        // return tabcount;
        return fragmentListTitles.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentListTitles.get(position);
    }
    public  void AddFragment(Fragment fragment,String Title){
        fragmentList.add(fragment);
        fragmentListTitles.add(Title);
    }
}
