package com.wrz.service.impl;

import com.wrz.dao.iHouseDao;
import com.wrz.entity.house;
import com.wrz.service.iHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements iHouseService {
    @Autowired
    private iHouseDao houseDao;
    @Override
    public List<house> queryAll() {
        return houseDao.queryAll();
    }
}
