package com.myproject.dao;


import com.myproject.models.User;
import org.apache.ibatis.annotations.Param;


public interface UserMapper{


    User getUserByID(@Param("id") int id);


}
