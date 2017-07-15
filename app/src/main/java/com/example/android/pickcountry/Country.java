package com.example.android.pickcountry;

public class Country {

    private String countryName;
    private int countryImage;

    public Country(String countryName, int countryImage) {
        this.countryName = countryName;
        this.countryImage = countryImage;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getCountryImage() {
        return countryImage;
    }

}
