package com.home.task.controller;

import com.home.task.model.Greetings;
import com.home.task.repository.GreetingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api")
public class GreetingsController {
    @Autowired
    public GreetingsRepository greetingsRepository;

    @PostMapping("post")
    public Greetings createGreeting(@Valid @RequestBody Greetings greetings) {
        return greetingsRepository.save(greetings);
    }

    @GetMapping("get")
    public List<Greetings> getAllGreeting() {
        return greetingsRepository.findAll();
    }

    @GetMapping("delete/{id}")
    public void deleteById(@PathVariable Long id) {
        greetingsRepository.deleteById(id);
    }

    @GetMapping("all")
    public void deleteAll() {
        greetingsRepository.deleteAll();
    }

}
