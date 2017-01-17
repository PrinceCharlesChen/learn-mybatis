package com.myproject.controller;

import com.myproject.models.User;
import com.myproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by C.D on 2017/1/17.
 */
@Controller
public class UserAction {

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUser(@PathVariable("id") int userid, Model model){
        User user = userService.getUserByID(userid);
        model.addAttribute("user", user);
        return "user";
    }


}
