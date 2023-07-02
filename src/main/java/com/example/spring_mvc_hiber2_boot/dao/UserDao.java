package com.example.spring_mvc_hiber2_boot.dao;

import com.example.spring_mvc_hiber2_boot.models.User;

import java.util.List;

public interface UserDao {

    public List<User> findAll();

    public User findOne(Long id);

    public void save(User user);

    public void delete(Long id);

    void update(Long id, User user);
}
