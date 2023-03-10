package com.pro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller//标识为是一个控制器，可以被前端调用
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(String name)
    {
        return "hello mdd wsh"+name;
    }
}
