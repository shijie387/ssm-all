package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/*
* @RequestMapping 定义请求的映射路径和JAVA代码中的对应关系
*
*
* */


@Controller
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll(){
        return "list.html"; // 需要视图解析器   视图解析器需要我们添加配置才生效
    }
}
