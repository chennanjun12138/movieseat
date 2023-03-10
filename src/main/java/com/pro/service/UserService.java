package com.pro.service;

import com.pro.domain.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void remove(int userId);
    void modify(User user);
    User getUser(int userId);
    List<User>getUsers();
}
