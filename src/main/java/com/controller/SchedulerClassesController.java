package com.controller;

import com.domain.SchedulerClasses;
import com.service.CrudService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("schedulers")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class SchedulerClassesController {
    CrudService<SchedulerClasses> service;

    @PostMapping("/scheduler")
    public void save(@RequestBody @Valid SchedulerClasses scheduler) {
        service.save(scheduler);
    }

    @PutMapping("/scheduler")
    public void update(@RequestBody @Valid SchedulerClasses scheduler) {
        service.update(scheduler);
    }

    @GetMapping("/scheduler/{id}")
    public SchedulerClasses find(@PathVariable int id) {
        return service.findById(id);
    }

    @DeleteMapping("/scheduler/{id}")
    public void delete(@PathVariable int id) {
        service.deleteById(id);
    }
}
