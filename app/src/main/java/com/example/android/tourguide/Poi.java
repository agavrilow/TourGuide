package com.example.android.tourguide;

public class Poi {

    private String poiName;
    private String poiDescription;
    private int poiPicture;

    public Poi(String poiName, String poiDescription, int poiPicture) {
        this.poiName = poiName;
        this.poiDescription = poiDescription;
        this.poiPicture = poiPicture;
    }

    public String getPoiName() {
        return poiName;
    }

    public String getPoiDescription() {
        return poiDescription;
    }

    public int getPoiPicture() {
        return poiPicture;
    }
}