package com.robin.demo.service;

import com.robin.demo.dao.DemoUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Administrator on 2016/3/10.
 */
@Service
public class DemoUserServiceImpl implements DemoUserService{
    @Autowired
    private DemoUserDao demoUserDao;

    public Map getUserByMobile(String mobile){
        return demoUserDao.getUserByMobile(mobile);
    }
}
