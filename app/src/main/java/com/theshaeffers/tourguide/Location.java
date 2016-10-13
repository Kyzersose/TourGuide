package com.theshaeffers.tourguide;

/**
 * Created by shaefferm on 10/11/2016.
 */

public class Location {

    private int mLocationName;
    private int mLocationAddress;
    private int mLocationDescription;
    private int mLocationImageId;

    public Location(int mLocationName, int mLocationAddress, int mLocationImageId) {
        this.mLocationName = mLocationName;
        this.mLocationAddress = mLocationAddress;
        this.mLocationImageId = mLocationImageId;

    }

    public Location(int mLocationName, int mLocationAddress, int mLocationDescription,
                    int mLocationImageId) {
        this.mLocationName = mLocationName;
        this.mLocationAddress = mLocationAddress;
        this.mLocationDescription = mLocationDescription;
        this.mLocationImageId = mLocationImageId;
    }

    public int getmLocationName() {
        return mLocationName;
    }

    public int getmLocationAddress() {
        return mLocationAddress;
    }

    public int getmLocationDescription() {
        return mLocationDescription;
    }

    public int getmLocationImageId(){
        return mLocationImageId;
    }

}
