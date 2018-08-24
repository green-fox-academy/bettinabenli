package com.greenfoxacademy.programmerfoxclub.repositories;

import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.models.Trick;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class FoxRepository {

    List<Fox> foxes = new ArrayList<>();

    private List<Food> foodValues = Arrays.asList(Food.values());
    private List<Drink> drinkValues = Arrays.asList(Drink.values());

    public FoxRepository() {

    }

    public Boolean isExist(String name) {
        for (Fox fox : foxes) {
            if (fox.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void save(Fox newfox) {
        foxes.add(newfox);
    }

    public Fox findByName(String name) {
        int index = 0;
        for (int i = 0; i < foxes.size(); i++) {
            if (foxes.get(i).getName().equals(name)) {
                index = i;
            }
        }
        return foxes.get(index);
    }

    public List<Food> getFoodValues() {
        return foodValues;
    }

    public List<Drink> getDrinkValues() {
        return drinkValues;
    }

}
