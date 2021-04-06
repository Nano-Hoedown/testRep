package org.wrz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wrz.dao.iUserDao;
import org.wrz.entity.user;
import org.wrz.service.iUserService;

import java.util.List;

@Service
public class UserServiceImpl implements iUserService {

    @Autowired
    private iUserDao userDao;
    @Override
    public List<user> queryList() {
        return userDao.queryList();
    }
}
