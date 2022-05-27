package com.bjpowernode.model;

import javax.print.DocFlavor;
import java.io.Serializable;

/**
 * @Author: Lishenglong
 * @Date: 2022/2/7 17:41
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 1901229007746699151L;

    private Integer id;
    private String name;
    private String phone;
    private Integer age;

    public Student(){

    }

    public Student(Integer id, String name, String phone, Integer age) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public static Student defaultStudent(){
        Student student = new Student();
        student.setId(0);
        student.setName("_");
        student.setPhone("_");
        student.setAge(0);
        return student;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}
