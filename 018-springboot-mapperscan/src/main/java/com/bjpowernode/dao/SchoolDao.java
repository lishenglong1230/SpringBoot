package com.bjpowernode.dao;

import com.bjpowernode.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


public interface SchoolDao {

    Student selectById(@Param("stuId") Integer id);
}
