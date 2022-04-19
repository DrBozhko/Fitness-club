package com.service;

import com.dao.CrudDAO;
import com.domain.Trainer;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class TrainerServiceImpl implements CrudService<Trainer>{
    CrudDAO<Trainer> dao;

    @Override
    public void save(Trainer trainer) {
        dao.save(trainer);
    }

    @Override
    public void update(Trainer trainer) {
        dao.save(trainer);
    }

    @Override
    public Trainer findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }
}
