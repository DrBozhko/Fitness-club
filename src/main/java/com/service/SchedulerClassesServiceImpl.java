package com.service;

import com.dao.CrudDAO;
import com.domain.Department;
import com.domain.SchedulerClasses;

public class SchedulerClassesServiceImpl implements CrudService<SchedulerClasses>{
    CrudDAO<SchedulerClasses> dao;

    @Override
    public void save(SchedulerClasses schedulerClasses) {
        dao.save(schedulerClasses);
    }

    @Override
    public void update(SchedulerClasses schedulerClasses) {
        dao.save(schedulerClasses);

    }

    @Override
    public SchedulerClasses findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }
}
