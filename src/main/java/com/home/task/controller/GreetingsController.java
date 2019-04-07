package com.home.task.controller;

import com.home.task.model.Greetings;
import com.home.task.repository.GreetingsRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class GreetingsController {
    @Autowired
    public GreetingsRepository greetingsRepository;

    @PostMapping("post")
    public Greetings createGreeting(@Valid @RequestBody Greetings greetings) {
        return greetingsRepository.saveAndFlush(greetings);
    }

    @GetMapping("get")
    public List<Greetings> getAllGreeting() {
        return greetingsRepository.findAll();
    }

    @GetMapping("find/{id}")
    public Optional<Greetings> findById(@PathVariable Long id) {
        return greetingsRepository.findById(id);
    }

    @GetMapping("delete/{id}")
    public List<Greetings> deleteById(@PathVariable Long id) {
        greetingsRepository.deleteById(id);
        return getAllGreeting();
    }

    @PutMapping("change/{id}")
    public void updateById(@PathVariable("id") Greetings greetingsFromDB, @RequestBody Greetings greetings){
        BeanUtils.copyProperties(greetings,greetingsFromDB, "id");
        greetingsRepository.save(greetingsFromDB);
    }

    @GetMapping("all")
    public void deleteAll() {
        greetingsRepository.deleteAll();
    }

}
