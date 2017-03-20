package com.bkm.spring.service.impl;

import com.bkm.spring.dao.UserDao;
import com.bkm.spring.model.User;
import com.bkm.spring.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/3/19.
 */
@Service
public class UserServiceImpl implements UserService
{
    @Resource
    private UserDao userDao;

    public List<User> getAllUsers()
    {
        return this.userDao.selectAllUser();
    }

    public User getUserByPhoneOrEmail(String emailOrPhone, Short state)
    {
        return this.userDao.selectUserByPhoneOrEmail(emailOrPhone,state);
    }

    public User getUserById(Long userId)
    {
        return this.userDao.selectUserById(userId);
    }
}



