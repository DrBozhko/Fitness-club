package com.service;

import com.dao.CrudDAO;
import com.domain.User;

public class UserServiceImpl implements CrudService<User> {
    CrudDAO<User> dao;

    @Override
    public void save(User user) {
        dao.save(user);
    }

    @Override
    public void update(User user) {
        dao.save(user);

    }

    @Override
    public User findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }
}
