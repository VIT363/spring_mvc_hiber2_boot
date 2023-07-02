package com.example.spring_mvc_hiber2_boot.services;


import com.example.spring_mvc_hiber2_boot.models.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public User findOne(Long id);

    public void save(User user);

    public void delete(Long id);

    void update(Long id, User user);
}
