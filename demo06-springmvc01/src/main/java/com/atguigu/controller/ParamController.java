package com.atguigu.controller;

import com.atguigu.pojo.Person;
import com.atguigu.pojo.Product;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/param")
public class ParamController {

    // url?username=zhangsan&password=123456&hobby=1&hobby=2
    /*
    * @RequestParam("username") 接收url编码参数的, 当参数的名字和处理器的形参参数名不一致时可以使用
    * */
    @RequestMapping("/param1")
    @ResponseBody
    public String  getKeyValueParam(
            @RequestParam("username") String uname,
            int password,
            int[] hobby
    ){
        return  "hello springMVC";
    }



    @RequestMapping("/param2")
    @ResponseBody
    public String  getKeyValueParam2(Person person){
        return  "hello springMVC";
    }

    @RequestMapping("/param3/{username}/{password}")
    @ResponseBody
    public String  getPathValue(
            @PathVariable("username") String uname,
            @PathVariable("password") Integer password
    ){
        return  "hello springMVC";
    }


    @RequestMapping("/param4")
    @ResponseBody
    public String  getJsonParam(
          @RequestBody Product product
    ){
        return  "hello springMVC";
    }


    @RequestMapping("/param5")
    @ResponseBody
    public String  getRequestHeader(
          @RequestHeader("accept") String accept
    ){
        return  "hello springMVC";
    }


    @RequestMapping("/param6")
    @ResponseBody
    public String  getCookie(
            @CookieValue("k1") String valueK1
    ){
        return  "hello springMVC";
    }








}
