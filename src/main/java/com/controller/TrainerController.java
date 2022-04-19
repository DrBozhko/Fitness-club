package com.controller;

import com.domain.Trainer;
import com.service.CrudService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("trainers")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class TrainerController {
    CrudService<Trainer> service;

    @PostMapping("/trainer")
    public void save(@RequestBody @Valid Trainer trainer) {
        service.save(trainer);
    }

    @PutMapping("/trainer")
    public void update(@RequestBody @Valid Trainer trainer) {
        service.update(trainer);
    }

    @GetMapping("/trainer/{id}")
    public Trainer find(@PathVariable int id) {
        return service.findById(id);
    }

    @DeleteMapping("/trainer/{id}")
    public void delete(@PathVariable int id) {
        service.deleteById(id);
    }
}
