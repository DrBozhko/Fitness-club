package com.controller;

import com.domain.Department;
import com.service.CrudService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("departments")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class DepartmentController {
    CrudService<Department> service;

    @PostMapping("/department")
    public void save(@RequestBody @Valid Department department) {
        service.save(department);
    }

    @PutMapping("/department")
    public void update(@RequestBody @Valid Department department) {
        service.update(department);
    }

    @GetMapping("/department/{id}")
    public Department find(@PathVariable int id) {
        return service.findById(id);
    }

    @DeleteMapping("/department/{id}")
    public void delete(@PathVariable int id) {
        service.deleteById(id);
    }
}
