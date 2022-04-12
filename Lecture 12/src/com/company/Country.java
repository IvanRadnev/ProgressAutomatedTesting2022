package com.company;

public class Country {
    private String countryName;
    private String language;
    private String capital;

    public Country(String countryName, String language, String capital) {
        this.countryName = countryName;
        this.language = language;
        this.capital = capital;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital() {
        this.capital = capital;
    }
}
