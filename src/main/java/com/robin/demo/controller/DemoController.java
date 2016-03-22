package com.robin.demo.controller;

import com.alibaba.fastjson.JSON;
import com.robin.demo.service.DemoService;
import com.robin.demo.service.DemoUserService;
import com.robin.demo.service.User;
import com.robin.demo.util.ErrorCode;
import com.robin.demo.util.ResultWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/3/10.
 */
@Controller
public class DemoController {
    @Autowired
    private DemoService demoService;

    @Autowired
    private DemoUserService demoCommonService;

    @ResponseBody
    @RequestMapping("/demo")
    public Map index() {
        Map resultMap = new HashMap();
        resultMap.put("status","success");
        resultMap.put("content",demoService.getString());
        return resultMap;
    }

    @ResponseBody
    @RequestMapping(value = "/mobile/{mobile:.+}", method = RequestMethod.GET)
    public Object getSingleLoanItem(@PathVariable("mobile") String mobile) {
        Map resultMap = new HashMap();
        resultMap.put("status","success");
        resultMap.put("content",demoCommonService.getUserByMobile(mobile));
        return resultMap;
    }

    @RequestMapping(value = "/mytest")
    public String getUsersById(@RequestParam(value = "userId")Integer userId,
                               ModelMap modelMap){
        User user = demoCommonService.findByUserId(userId);
        ResultWrapper<User> resultWrapper;
        if (user != null) {
            resultWrapper = new ResultWrapper<User>(ErrorCode.OK, user);
        }
        else {
            resultWrapper = new ResultWrapper(ErrorCode.ErrorCode_QUERY_FAIL);
        }
        modelMap.put("userResult", resultWrapper);
        return "mytest";
    }
}