package ru.yulialyapushkina.state.model.entities;

public class Region {
    private String regionName;
    private String regionCenter;

    private double regionArea;
    private District [] districts;

    public Region(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionCenter(String regionCenter) {
        this.regionName = regionCenter;
    }
    public String getRegionCenter() {
        return regionCenter;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    public double getRegionArea() {
        return regionArea;
    }

    public void setRegionArea(double regionArea) {
        this.regionArea = regionArea;
    }
}
