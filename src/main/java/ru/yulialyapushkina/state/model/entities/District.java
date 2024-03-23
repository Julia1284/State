package ru.yulialyapushkina.state.model.entities;

public class District {
    private String districtName;

    City [] cities;


    public District(String districtName) {
        this.districtName = districtName;
    }

    public String getDistrictName(){
        return districtName;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }
}
