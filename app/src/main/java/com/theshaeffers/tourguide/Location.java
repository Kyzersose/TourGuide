package com.theshaeffers.tourguide;

/**
 * Created by shaefferm on 10/11/2016.
 */

public class Location {

    private String mLocationName;
    private String mLocationAddress;
    private String mLocationDescription;
    private int mLocationImageId;
    //add image later
    // private int mLocationImageId;


    public Location(String mLocationName, String mLocationAddress, int mLocationImageId) {
        this.mLocationName = mLocationName;
        this.mLocationAddress = mLocationAddress;
        this.mLocationImageId = mLocationImageId;

    }

    public Location(String mLocationName, String mLocationAddress, String mLocationDescription,
                    int mLocationImageId) {
        this.mLocationName = mLocationName;
        this.mLocationAddress = mLocationAddress;
        this.mLocationDescription = mLocationDescription;
        this.mLocationImageId = mLocationImageId;
    }

    public String getmLocationName() {
        return mLocationName;
    }

    public String getmLocationAddress() {
        return mLocationAddress;
    }

    public String getmLocationDescription() {
        return mLocationDescription;
    }

    public int getmLocationImageId(){
        return mLocationImageId;
    }

}
