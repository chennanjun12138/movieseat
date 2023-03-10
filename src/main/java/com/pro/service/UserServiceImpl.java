package com.pro.service;

import com.pro.dao.UserMapper;
import com.pro.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void save(User user) {
        userMapper.insert(user);
    }

    @Override
    public void remove(int userId) {
        userMapper.delete(userId);
    }

    @Override
    public void modify(User user) {
        userMapper.update(user);
    }

    @Override
    public User getUser(int userId) {
        return userMapper.selectUser(userId);
    }
    @Override
    public List<User> getUsers() {
        return userMapper.selectUsers();
    }
}
