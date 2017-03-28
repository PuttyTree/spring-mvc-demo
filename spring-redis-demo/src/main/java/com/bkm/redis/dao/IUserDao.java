package com.bkm.redis.dao;

import com.bkm.redis.model.User;

import java.util.List;

/**
 * Created by yongli.chen on 2017/3/28.
 */
public interface IUserDao
{
    boolean add(User user);

    boolean add(List<User> list);

    void delete(String key);

    void delete(List<String> keys);

    boolean update(User user);

    User get(String keyId);
}
