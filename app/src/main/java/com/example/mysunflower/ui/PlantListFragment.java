package com.example.mysunflower.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mysunflower.databinding.FragmentPlantListBinding;


public class PlantListFragment extends Fragment {
    FragmentPlantListBinding mBinding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = FragmentPlantListBinding.inflate(inflater, container, false);

        return mBinding.getRoot();
    }
}
