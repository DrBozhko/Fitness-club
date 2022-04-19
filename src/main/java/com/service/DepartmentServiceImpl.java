package com.service;

import com.dao.CrudDAO;
import com.domain.Department;

public class DepartmentServiceImpl implements CrudService<Department>{
    CrudDAO<Department> dao;

    @Override
    public void save(Department department) {
        dao.save(department);
    }

    @Override
    public void update(Department department) {
        dao.save(department);
    }

    @Override
    public Department findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }
}
