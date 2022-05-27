package com.bjpowernode.service;

import com.bjpowernode.model.Student;

/**
 * @Author: Lishenglong
 * @Date: 2022/2/7 17:43
 */

//Dubbo接口
public interface StudentService {
    int addStudent(Student student);

    Student queryStudent(Integer id);
}
