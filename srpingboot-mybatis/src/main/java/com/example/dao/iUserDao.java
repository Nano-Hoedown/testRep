package com.example.dao;

import com.example.entity.users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 注入@mapper,本质在mybatis中是一个mapper
 */
@Mapper
@Repository
public interface iUserDao {

    @Select("select * from users")
    @ResultMap("selectMap")
    List<users> queryUsers();
}
