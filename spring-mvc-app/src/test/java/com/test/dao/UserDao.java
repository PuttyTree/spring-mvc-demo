package com.test.dao;

import com.test.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/3/21.
 */
public interface UserDao
{
    public void save(User user);
    public List<User> query(String sql, Object[] args);
}
