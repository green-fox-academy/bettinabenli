package com.greenfoxacademy.listingtodosh2.controllers;

import com.greenfoxacademy.listingtodosh2.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todolist", todoRepository.findAll());
        return "todoslist";
    }
}
