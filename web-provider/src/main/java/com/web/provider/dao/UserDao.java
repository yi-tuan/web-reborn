package com.web.provider.dao;

import com.web.provider.model.User;

import java.util.List;

/**
 * @author liuxing
 * @date 2019/11/16
 * @description UserDao
 */
public interface UserDao {
    User getOne(String studentNum);

    List<User> getAll();
}
