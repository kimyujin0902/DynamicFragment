package com.android.dynamicfragment;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MonthPagerAdapter extends FragmentStateAdapter {
    @NonNull
    private static int NUM_ITEMS=3;
    public MonthPagerAdapter(FragmentActivity fa) {
        super(fa);
    }
    @Override
    public Fragment createFragment(int position) {
        Log.i("hey", "createFragment");
        MonthFragment monthFragment = new MonthFragment();
        return monthFragment;
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
