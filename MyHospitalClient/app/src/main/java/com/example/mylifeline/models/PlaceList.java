package com.example.mylifeline.models;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.ArrayList;


@Parcel
public class PlaceList {

    @SerializedName("results")
    public ArrayList<SinglePlace> places;
    @SerializedName("next_page_token")
    String nextPageToken;

    public PlaceList() {
    }


    public PlaceList(String nextPageToken, ArrayList<SinglePlace> places) {
        this.nextPageToken = nextPageToken;
        this.places = places;
    }


}
