package com.example.dao;

import com.example.entity.user;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface iUserDao {
    @Select("select * from users")
    @ResultMap("selectMap")
    List<user> queryAll();
}
