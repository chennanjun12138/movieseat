package com.pro.dao;

import com.pro.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    //将userMapper对象注入到当前测试类当中
    @Autowired
    private UserMapper userMapper;
    @Test
    public void selectUsers() {
        List<User> userList=userMapper.selectUsers();
      for (User user :userList)
      {
          System.out.println(user.getUsername()+","+user.getPassword());
      }
    }

    @Test
    public void insert() {
        userMapper.insert(new User(1,"zsf","3333"));
    }

    @Test
    public void delete() {
        userMapper.delete(1);
    }

    @Test
    public void update() {
        User user=new User();
        user.setUserId(1);
        user.setUsername("zs");
        user.setPassword("3333");
        userMapper.update(user);
    }

    @Test
    public void selectUser() {
        User user=userMapper.selectUser(1);
        System.out.println(user.getUsername()+","+user.getPassword());
    }
}