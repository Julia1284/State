package ru.yulialyapushkina.state.model.storage;

import ru.yulialyapushkina.state.model.entities.District;
import ru.yulialyapushkina.state.model.entities.Region;

import java.util.ArrayList;
import java.util.List;

public class State {
    private List<Region>  regionList;
    private String stateName;
    private static State instance = null;

    private  State (String stateName){
        this.stateName = stateName;
        regionList = new ArrayList<>();
    }
    public static State getInstance(String stateName) {
        if (instance == null) {
            instance = new State(stateName);
        }
        return instance;
    }

    public void addRegion(Region region) {
        regionList.add(region);
    }
}
