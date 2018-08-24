package com.greenfoxacademy.programmerfoxclub.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Fox {

    private String name;
    private String food;
    private String drink;
    private List<Trick> listOfLearnedTricks = new ArrayList<>();
    private List<Trick> listOfAvailableTricks;

    public Fox() {

    }

    public Fox(String name) {
        this.name = name;
        this.food = "salad";
        this.drink = "water";
        initListOfTricks();
    }

    private void initListOfTricks() {
        listOfAvailableTricks = new ArrayList<>();
        for (Trick trick : Trick.values()) {
            listOfAvailableTricks.add(trick);
        }
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public List<Trick> getListOfLearnedTricks() {
        return listOfLearnedTricks;
    }

    public List<Trick> getListOfAvailableTricks() {
        return listOfAvailableTricks;
    }

    public void addNewTrick(Trick newtrick) {
        listOfLearnedTricks.add(newtrick);
        listOfAvailableTricks.remove(newtrick);
    }
}
