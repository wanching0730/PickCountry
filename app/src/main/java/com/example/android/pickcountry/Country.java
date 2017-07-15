package com.example.android.pickcountry;

public class Country {

    private String countryName;
    private static final int NO_IMAGE = -1;
    private int countryImage = NO_IMAGE;

    public Country(String countryName){
        this.countryName = countryName;
    }

    public Country(String countryName, int countryImage){
        this.countryName = countryName;
        this.countryImage = countryImage;
    }

    public String getCountryName(){
        return countryName;
    }

    public int getCountryImage(){
        return countryImage;
    }

    public boolean checkImage(){ return countryImage != NO_IMAGE;}
}
