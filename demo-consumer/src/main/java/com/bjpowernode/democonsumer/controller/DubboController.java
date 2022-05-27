package com.bjpowernode.democonsumer.controller;

import com.bjpowernode.model.Student;
import com.bjpowernode.service.StudentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Lishenglong
 * @Date: 2022/2/7 18:19
 */
@RestController

public class DubboController {
    @DubboReference(interfaceClass = StudentService.class, version = "1.0")
    private StudentService studentService;

    @PostMapping("/student/add")
    public String addStudent(Student stuent) {
        //对student的数据做处理，name 需要有值 ， phone ，age 必须有值

        int result = studentService.addStudent(stuent);

        String msg = "请稍后处理";
        if (result == 1) {
            msg = "添加学生" + stuent.getName() + "，成功的";
        } else if (result == 2) {
            msg = stuent.getPhone() + ",此手机号已经注册过了，请更换手机号";
        } else if (result == 3) {
            msg = "手机号为空";
        }
        return "消费者添加学生：" + msg;
    }

    @GetMapping("/student/query")
    public String queryStudent(Integer id) {
        String msg = "";
        Student student = null;
        if (id != null && id > 0) {
            student = studentService.queryStudent(id);
            if (student != null) {
                msg = "查询的学生信息：" + student.toString();
            } else {
                msg = "没有查询到";
            }
        } else {
            msg = "查询的id不正确";
        }
        return msg;
    }


}

