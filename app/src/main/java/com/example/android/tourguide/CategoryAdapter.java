package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0: return new AttractionsFragment();
            case 1: return new ParksFragment();
            case 2: return new ClubsFragment();
            case 3: return new BarsFragment();
        } return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0:return mContext.getString(R.string.category_Attractions);
            case 1:return mContext.getString(R.string.category_Parks);
            case 2:return mContext.getString(R.string.category_Clubs);
            case 3:return mContext.getString(R.string.category_Pubs);
        } return null;
    }
}