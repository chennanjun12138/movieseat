package com.pro.dao;
import com.pro.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository//标识当前接口已加入容器
public interface UserMapper {
    //查询用户列表
    List<User> selectUsers();
    //添加
    void  insert(User user);
    //删除
    void  delete(int userId);
    //修改
    void  update(User user);
    //查询单个用户
    User selectUser(int userId);
}
