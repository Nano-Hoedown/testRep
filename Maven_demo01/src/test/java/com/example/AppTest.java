package com.example;

import com.example.dao.iUserDao;
import com.example.entity.user;
import com.example.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class AppTest {
    @Test
    public void SunMybatis(){
        SqlSession session = new MybatisUtil().getSession();
        iUserDao userDao = session.getMapper(iUserDao.class);
        List<user> users = userDao.queryAll();
        for (user user : users) {
            System.out.println(user);
        }

    }
}
