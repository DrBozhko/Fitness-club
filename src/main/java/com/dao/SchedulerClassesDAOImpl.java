package com.dao;

import com.domain.SchedulerClasses;
import com.repository.SchedulerClassesRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class SchedulerClassesDAOImpl implements CrudDAO<SchedulerClasses>{
    SchedulerClassesRepository repository;
    @Override
    public void save(SchedulerClasses schedulerClasses) {
        repository.save(schedulerClasses);
    }

    @Override
    public void update(SchedulerClasses schedulerClasses) {
        repository.save(schedulerClasses);
    }

    @Override
    public SchedulerClasses findById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
