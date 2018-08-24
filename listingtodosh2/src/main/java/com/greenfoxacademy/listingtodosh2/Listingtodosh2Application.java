package com.greenfoxacademy.listingtodosh2;

import com.greenfoxacademy.listingtodosh2.models.Todo;
import com.greenfoxacademy.listingtodosh2.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Listingtodosh2Application implements CommandLineRunner {

    private TodoRepository todoRepository;

    @Autowired
    public Listingtodosh2Application(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Listingtodosh2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("I have to learn Object Relational Mapping.", true, false));
        todoRepository.save(new Todo("I have not to learn dependency injection.", false, true));
        todoRepository.save(new Todo("I have to learn what is JPA.", true, false));
        todoRepository.save(new Todo("I have to learn what does IoC mean.", true, true));
    }
}

