package com.example.mysunflower.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.viewpager2.widget.ViewPager2;

import com.example.mysunflower.R;
import com.example.mysunflower.adapters.SunflowerPagerAdapter;
import com.example.mysunflower.databinding.FragmentGardenBinding;

public class GardenFragment extends Fragment {
    FragmentGardenBinding mBinding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = FragmentGardenBinding.inflate(inflater,container,false);
        mBinding.setHasPlantings(false);
        mBinding.addPlant.setOnClickListener(v -> {
            ViewPager2 viewPager2 = getActivity().findViewById(R.id.view_pager);
            viewPager2.setCurrentItem(SunflowerPagerAdapter.PLANT_LIST_PAGE_INDEX,true);
        });
        return mBinding.getRoot();
    }
}
