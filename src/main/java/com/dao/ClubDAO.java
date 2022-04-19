package com.dao;

import com.domain.Club;
import com.domain.Department;
import com.repository.ClubRepository;

public class ClubDAO implements CrudDAO<Club>{
    ClubRepository repository;

    @Override
    public void save(Club club) {

    }

    @Override
    public void update(Club club) {

    }

    @Override
    public Club findById(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
