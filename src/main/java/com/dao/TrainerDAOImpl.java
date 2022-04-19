package com.dao;

import com.domain.Trainer;
import com.repository.TrainerRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TrainerDAOImpl implements CrudDAO<Trainer>{
    TrainerRepository repository;

    @Override
    public void save(Trainer trainer) {
        repository.save(trainer);
    }

    @Override
    public void update(Trainer trainer) {
        repository.save(trainer);
    }

    @Override
    public Trainer findById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
