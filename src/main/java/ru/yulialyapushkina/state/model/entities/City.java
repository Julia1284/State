package ru.yulialyapushkina.state.model.entities;

public class City {
    private String cityName;
    boolean isRegionCenter;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public boolean isRegionCenter() {
        return isRegionCenter;
    }

    public void setRegionCenter(boolean regionCenter) {
        isRegionCenter = regionCenter;
    }
}
