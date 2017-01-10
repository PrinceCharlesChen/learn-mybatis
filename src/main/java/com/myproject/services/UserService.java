package com.myproject.services;

import com.myproject.dao.UserMapper;
import com.myproject.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/1/6.
 */
@Service
public class UserService {

    @Autowired
    public UserMapper userMapper;

    public User getUserByID(int userid){
        return userMapper.getUserByID(userid);
    }






}
