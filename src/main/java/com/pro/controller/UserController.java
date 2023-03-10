package com.pro.controller;

import com.pro.domain.User;
import com.pro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    //注入业务层
    @Autowired
    private UserService userService;

    @GetMapping("/index")
       public String toIndex(){
           return "index";
       }

    @GetMapping("/toWelcome")
    public String toWelcome(){
        return "welcome";
    }
    //根据id得到用户的服务接口
    @GetMapping("/user")
    @ResponseBody
    public Object user(int userId)
    {
       User user= userService.getUser(userId);
       return user;
    }
    @GetMapping("/users")
    public String users(Model model){
      List<User> userList= userService.getUsers();
      model.addAttribute("userList",userList);
      return "users";
    }
    //跳转到添加页
    @GetMapping("/toadd")
    public String toadd(){
        return  "add";
    }
    //添加用户
    @PostMapping("/add")
    public String add(User user){
        userService.save(user);
        return "redirect:users";
    }

    @GetMapping("/delete")
    public String delete(int userId){
        userService.remove(userId);
        return  "redirect:users";
    }
    //查询数据，然后去修改页面显示
    @GetMapping("/toUpdate")
    public String toUpdate(int userId,Model model)
    {
        User user=userService.getUser(userId);
        model.addAttribute("user",user);
        return "update";
    }

    //修改页面提交的数据
    @PostMapping("/update")
    public  String update(User user)
    {
          userService.modify(user);
          return  "redirect:users";
    }
}
