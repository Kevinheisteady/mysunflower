package com.example.mysunflower.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mysunflower.R;
import com.example.mysunflower.adapters.SunflowerPagerAdapter;
import com.example.mysunflower.databinding.FragmentHomeViewPagerBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeViewPagerFragment extends Fragment {
    FragmentHomeViewPagerBinding mBinding;

    public HomeViewPagerFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding = FragmentHomeViewPagerBinding.inflate(inflater,container,false);
        ViewPager2 viewPager = mBinding.viewPager;
        viewPager.setAdapter(new SunflowerPagerAdapter(this));

        new TabLayoutMediator(mBinding.tabs, viewPager, (tab, position) -> {
            tab.setIcon(getTabIcon(position));
            tab.setText(getTabTitle(position));
        }).attach();
        ((AppCompatActivity)getActivity()).setSupportActionBar(mBinding.toolbar);
        return mBinding.getRoot();
    }

    String getTabTitle(int position){
        switch (position) {
            case SunflowerPagerAdapter.PLANT_LIST_PAGE_INDEX:
                return getString(R.string.plant_list_title);
            case SunflowerPagerAdapter.MY_GARDEN_PAGE_INDEX:
                return getString(R.string.my_garden_title);
        }
        return "";
    }

    int getTabIcon(int position){
        switch (position) {
            case SunflowerPagerAdapter.PLANT_LIST_PAGE_INDEX:
                return R.drawable.garden_tab_selector;
            case SunflowerPagerAdapter.MY_GARDEN_PAGE_INDEX:
                return R.drawable.plant_list_tab_selector;
        }
        return -1;
    }
}