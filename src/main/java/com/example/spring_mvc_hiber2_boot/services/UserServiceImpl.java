package com.example.spring_mvc_hiber2_boot.services;

import com.example.spring_mvc_hiber2_boot.dao.UserDao;
import com.example.spring_mvc_hiber2_boot.models.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findOne(Long id) {
        return userDao.findOne(id);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }

    @Override
    public void update(Long id, User user) {
        userDao.update(id, user);
    }
}
