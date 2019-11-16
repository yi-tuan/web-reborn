package com.web.provider.service.impl;

import com.web.provider.dao.UserDao;
import com.web.provider.model.User;
import com.web.provider.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author liuxing
 * @date 2019/11/16
 * @description
 */
@Service(version = "${web.service.version}")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getOne(String studentNum) {
        return userDao.getOne(studentNum);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}
