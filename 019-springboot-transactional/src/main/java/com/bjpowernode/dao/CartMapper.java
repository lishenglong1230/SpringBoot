package com.bjpowernode.dao;

import com.bjpowernode.model.Cart;

public interface CartMapper {
    int deleteByPrimaryKey(String id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}