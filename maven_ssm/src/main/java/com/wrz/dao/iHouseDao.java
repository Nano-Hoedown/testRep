package com.wrz.dao;

import com.wrz.entity.house;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface iHouseDao {
    @Select("SELECT * FROM t_house")
    @ResultMap("selectMap")
    List<house> queryAll();
}
