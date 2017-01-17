package com.myproject.services;

import com.alibaba.fastjson.JSON;
import com.myproject.models.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/1/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/config/spring-mybatis.xml"})
public class TestUserService {
    private static Logger logger = Logger.getLogger(TestUserService.class);

    @Autowired
    private UserService userService;

    @Test
    public void TestGetUserByID(){
        User user = userService.getUserByID(20);
        logger.info(JSON.toJSONString(user));
    }




}
