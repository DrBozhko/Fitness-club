package com.controller;

import com.domain.User;
import com.service.CrudService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("users")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class UserController {
    CrudService<User> service;

    @PostMapping("/user")
    public void save(@RequestBody @Valid User user) {
        service.save(user);
    }

    @PutMapping("/user")
    public void update(@RequestBody @Valid User user) {
        service.update(user);
    }

    @GetMapping("/user/{id}")
    public User find(@PathVariable int id) {
        return service.findById(id);
    }

    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable int id) {
        service.deleteById(id);
    }
}
