package com.web.consumer.controller;

import com.web.provider.model.User;
import com.web.provider.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: liuxing
 * @date: 2019/11/13
 * @description:
 */
@RestController
public class UserController {
    @Autowired(required = false)
    @Reference(version = "${web.service.version}")
    private UserService userService;

    @RequestMapping("/getUsers")
    public List<User> getAllUser() {
        List<User> users = userService.getAll();
        return users;
    }

    @RequestMapping("/getUser/{studentNum}")
    public User getUser(@PathVariable("studentNum") String studentNum) {
        return userService.getOne(studentNum);
    }

}
