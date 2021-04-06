package org.wrz.dao;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wrz.entity.user;

import javax.faces.annotation.RequestMap;
import java.util.List;

public interface iUserDao {
    @Select("SELECT * FROM users")
    @ResultMap("selectMap")
    List<user> queryList();
}
