package com.example.hospitaladmin;

/**
 * Created by Rishabh Gupta on 29-03-2019
 */

public class StaffListItem {
    private String mName;
    private String mExpertise;
    private String mImageUrl;

    public StaffListItem(String name, String expertise, String imageUrl) {
        mName = name;
        mExpertise = expertise;
        mImageUrl = imageUrl;
    }

    public String getmName() {
        return mName;
    }

    public String getmExpertise() {
        return mExpertise;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }
}
