package com.example.thongtinsinhvien.thongtincanhan;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.thongtinsinhvien.fragment.ClassFragment;
import com.example.thongtinsinhvien.fragment.FavouriteFragment;
import com.example.thongtinsinhvien.fragment.ProfileFragment;

public class ProfilePageAdapter extends FragmentStatePagerAdapter {


    public ProfilePageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:{
                return new thongtincanhan();
            }
            case 1:{
                return new thontinlopsinhhoat();
            }
            case 2:{
                return new thongtintamtru();
            }
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Thông tin cá nhân";
            case 1:
                return "Thông tin lớp sinh hoạt";
            case 2:
                return "Thông tin tạm trú";
            default: return "Thông tin cá nhân";
        }
    }
}
