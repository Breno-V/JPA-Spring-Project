package com.exemplo.api_produtos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.api_produtos.model.Habit;
import com.exemplo.api_produtos.repository.HabitRepository;

@RestController
@RequestMapping("/habits")
public class HabitController {
    private final HabitRepository repository;

    public HabitController(HabitRepository repository){
        this.repository = repository;
    }

    @PostMapping
    public Habit create(@RequestBody Habit habit){
        return repository.save(habit);
    }

    @GetMapping
    public List<Habit> list() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Habit search(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Habit update(@PathVariable Long id, @RequestBody Habit newHabit) {
        return repository.findById(id).map(habit -> {
            habit.setName(newHabit.getName());
            habit.setActive(newHabit.getActive());
            return repository.save(habit);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    } 
}