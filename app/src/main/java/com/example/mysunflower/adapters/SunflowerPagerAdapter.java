package com.example.mysunflower.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.mysunflower.ui.GardenFragment;
import com.example.mysunflower.ui.PlantListFragment;

public class SunflowerPagerAdapter extends FragmentStateAdapter {
    public static final int MY_GARDEN_PAGE_INDEX = 0;
    public static final int PLANT_LIST_PAGE_INDEX = 1;
    public SunflowerPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case MY_GARDEN_PAGE_INDEX:
                return new GardenFragment();
            case PLANT_LIST_PAGE_INDEX:
                return new PlantListFragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
