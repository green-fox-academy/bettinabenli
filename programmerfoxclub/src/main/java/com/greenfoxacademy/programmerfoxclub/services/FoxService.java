package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import com.greenfoxacademy.programmerfoxclub.models.Fox;

import java.util.List;

public interface FoxService {

    Boolean isExist(String foxname);

    Fox login(String foxname);

    Fox findOne(String name);

    List<Food> getFoodValues();

    List<Drink> getDrinkValues();
}
