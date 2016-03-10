package com.robin.demo.service;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/3/10.
 */
@Service
public class DemoServiceImpl implements DemoService{
    public String getString(){
        return "Demo Service";
    }
}
