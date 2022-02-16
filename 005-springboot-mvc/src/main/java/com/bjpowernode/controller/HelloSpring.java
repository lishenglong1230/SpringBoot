package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Lishenglong
 * @Date: 2022/1/28 17:25
 */

@Controller //代表自己是controller
public class HelloSpring {
    @RequestMapping("/hello")
    @ResponseBody//返回的字符串当做数据来用返回给浏览器
    public String helloSpringBoot(){
        return "欢迎使用SpringBoot框架";
    }
}
