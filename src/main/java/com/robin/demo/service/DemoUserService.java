package com.robin.demo.service;

import java.util.Map;

/**
 * Created by Administrator on 2016/3/10.
 */
public interface DemoUserService {
    Map getUserByMobile(String mobile);
    User findByUserId(Integer uId);
}
