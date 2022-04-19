package com.dao;

import com.domain.Department;
import com.repository.DepartmentRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class DepartmentDAOImpl implements CrudDAO<Department>{
    DepartmentRepository repository;
    @Override
    public void save(Department department) {
        repository.save(department);
    }

    @Override
    public void update(Department department) {
        repository.save(department);
    }

    @Override
    public Department findById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
