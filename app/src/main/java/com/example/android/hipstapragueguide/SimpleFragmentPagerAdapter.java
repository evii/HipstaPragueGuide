package com.example.android.hipstapragueguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by evi on 9. 6. 2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CoffeeFragment();
        } else if (position == 1){
            return new EatingFragment();
        } else if (position == 2){
            return new NightFragment();
        } else {
            return new ActivitiesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.fragment_cofee);
        } else if (position == 1) {
            return mContext.getString(R.string.fragment_eating);
        } else if (position == 2) {
            return mContext.getString(R.string.fragment_night);
        } else {
            return mContext.getString(R.string.fragment_activities);
        }
    }
}