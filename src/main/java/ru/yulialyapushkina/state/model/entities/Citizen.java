package ru.yulialyapushkina.state.model.entities;

import ru.yulialyapushkina.state.model.storage.State;

public class Citizen {
    private String firstName;
    private String lastName;
    private int age;
    private State state;
    private static int id=1;

    public Citizen(String firstName, String lastName, int age, State state) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.state = state;
        id++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getId() {
        return id;
    }

    public void setState (State state){
        this.state = state;
    }

    public State getState (){
        return state;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", state=" + state +
                '}';
    }
}
