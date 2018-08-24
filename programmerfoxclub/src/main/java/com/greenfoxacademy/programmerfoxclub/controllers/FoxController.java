package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Trick;
import com.greenfoxacademy.programmerfoxclub.services.FoxServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

    private FoxServiceImpl foxService;

    @Autowired
    public FoxController(FoxServiceImpl foxService) {
        this.foxService = foxService;
    }

    @PostMapping("/nutritionStore/{foxname}")
    public String changeFoodAndDrink(@PathVariable String foxname,
                                     @RequestParam("food") String food,
                                     @RequestParam("drink") String drink, Model model) {
        foxService.findOne(foxname).setFood(food);
        foxService.findOne(foxname).setDrink(drink);
        model.addAttribute("fox", foxService.findOne(foxname));
        return "redirect:/index/" + foxname;
    }

    @PostMapping("/trickCenter/{foxname}")
    public String postTrickCenter(@PathVariable String foxname,
                                  @RequestParam("trick") Trick trick, Model model) {
        foxService.findOne(foxname).addNewTrick(trick);
        model.addAttribute("fox", foxService.findOne(foxname));
        return "redirect:/index/" + foxname;
    }
}
