package com.web.provider.service;

import com.web.provider.model.User;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

/**
 * @author: liuxing
 * @date: 2019/11/13
 * @description:
 */
public interface UserService {
    User getOne(String studentNum);

    List<User> getAll();
}

