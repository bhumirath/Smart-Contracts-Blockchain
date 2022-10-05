package com.example.myapplication.util;


import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.myapplication.MainActivity;
import com.example.myapplication.FindFragment;
import com.example.myapplication.OrderFragment;
import com.example.myapplication.MyAccountFragment;
import com.example.myapplication.ManageFragment;

/**
 * Created by yuan.
 */
//set the fragment layout
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private final int PAGER_COUNT = 4;
    private FindFragment findFragment = null;
    private OrderFragment orderFragment = null;
    private MyAccountFragment myAccountFragment = null;
    private ManageFragment manageFragment = null;


    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        findFragment = new FindFragment();
        orderFragment = new OrderFragment();
        myAccountFragment = new MyAccountFragment();
        manageFragment = new ManageFragment();
    }


    @Override
    public int getCount() {
        return PAGER_COUNT;
    }

    @Override
    public Object instantiateItem(ViewGroup vg, int position) {
        return super.instantiateItem(vg, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        System.out.println("position Destory" + position);
        super.destroyItem(container, position, object);
    }

    //bind the page to the fragment
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case MainActivity.PAGE_ONE:
                fragment = findFragment;
                break;
            case MainActivity.PAGE_TWO:
                fragment = orderFragment;
                break;
            case MainActivity.PAGE_THREE:
                fragment = myAccountFragment;
                break;
            case MainActivity.PAGE_FOUR:
                fragment = manageFragment;
                break;
        }
        return fragment;
    }


}

