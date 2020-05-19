package com.example.hp.swipeviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class DemoFragmentAdapter extends FragmentStatePagerAdapter {
    public DemoFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        DemoFragment demoFragment = new DemoFragment();
        Bundle bundle = new Bundle();
        i=i+1;
        bundle.putString("Message","Hello From Page :" +i);
        demoFragment.setArguments(bundle);
        return demoFragment;
    }

    @Override
    public int getCount() {
        return 100;
    }
}
