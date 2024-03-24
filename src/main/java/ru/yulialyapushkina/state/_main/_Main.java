package ru.yulialyapushkina.state._main;

import ru.yulialyapushkina.state.model.entities.Citizen;
import ru.yulialyapushkina.state.model.entities.City;
import ru.yulialyapushkina.state.model.entities.District;
import ru.yulialyapushkina.state.model.entities.Region;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class _Main {
    public static void main(String[] args) {

        Region region1 = new Region("Московская область");
        region1.setRegionCenter("Москва");
        region1.setRegionArea(44329);
        District district1 = new District("Ногинский");
        District district2 = new District("Орехово-Зуевский");
        District district3 = new District("Павлово-Посадский");
        District district4 = new District("Красногорский");

        District [] districtsRegion1  = {district1,district2,district3,district4};
        region1.setDistricts(districtsRegion1);

        City city1 = new City("Ногинск");
        city1.setRegionCenter(true);
        City city2 = new City("Электросталь");
        City [] citiesDistrict1 = {city1, city2};
        City city3 = new City("Орехово-Зуево");
        city3.setRegionCenter(true);
        City city4 = new City("Ликино-Дулево");
        City [] citiesDistrict2 = {city3, city4};
        City city5 = new City("Павловский Посад");
        city5.setRegionCenter(true);
        City city6 = new City("Андреево");

        City [] citiesDistrict3 = {city5, city6};

        City city7 = new City("Красногорск");
        city7.setRegionCenter(true);
        City city8 = new City("Опалиха");
        City city9 = new City("Павшино");
        City [] citiesDistrict4 = {city7, city8, city9};

        Citizen [] citizens = {new Citizen(), new Citizen(), new Citizen()};
        System.out.println(Arrays.toString(citizens));
    }
}
