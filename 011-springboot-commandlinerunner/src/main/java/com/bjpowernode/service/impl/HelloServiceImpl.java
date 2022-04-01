package com.bjpowernode.service.impl;

import com.bjpowernode.service.HelloService;
import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "你好："+name;
    }
}
