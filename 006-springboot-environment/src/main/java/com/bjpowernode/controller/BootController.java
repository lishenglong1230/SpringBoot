package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Lishenglong
 * @Date: 2022/1/28 18:05
 */

@Controller
public class BootController {
    @RequestMapping("/hello")
    @ResponseBody
    public String doSome(){
        return "hello SpringBoot应用，设置了端口";
    }
}
