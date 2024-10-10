package com.example.thongtinsinhvien.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thongtinsinhvien.R;
import com.example.thongtinsinhvien.thongtincanhan.ProfilePageAdapter;
import com.example.thongtinsinhvien.widget.CustomViewPage;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    private TabLayout tabLayout;
    private CustomViewPage viewPager;
    private  View mvView;

    public ProfileFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mvView =  inflater.inflate(R.layout.fragment_profile, container, false);

        tabLayout = mvView.findViewById(R.id.tab_layout);
        viewPager = mvView.findViewById(R.id.viewpage_profile);
        ProfilePageAdapter profilePageAdapter = new ProfilePageAdapter(getChildFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(profilePageAdapter);
        viewPager.setPagingEnable(false);
        tabLayout.setupWithViewPager(viewPager);
        return mvView;
    }
}