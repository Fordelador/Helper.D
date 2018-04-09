package com.example.davils.helperd.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.davils.helperd.fragment.ExampleFragment;

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter{

    private String[] tabs;
    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs= new String[]{
                "Tab 1",
                "Новости",
                "Tab 1"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                break;

            case 1:
                return ExampleFragment.getInstans();

            case 2:
                break;

        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
