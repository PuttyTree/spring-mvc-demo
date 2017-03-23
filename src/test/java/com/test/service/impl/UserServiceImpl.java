package com.test.service.impl;


import java.util.List;

import com.test.dao.IUserDao;
import com.test.model.User;
import com.test.service.IUserService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class UserServiceImpl implements IUserService
{
    private IUserDao userDao;
    public IUserDao getUserDao(){
        return this.userDao;
    }
    public void setUserDao(IUserDao userDao){
        this.userDao = userDao;
    }

    public void saveUser()
    {
        User u1 = new User();
        u1.setName("邵");
        u1.setAge(24);
        userDao.save(u1);

        if (1 + 1 > 1)
        {
            throw new RuntimeException("Runtime error...");//抛出运行时异常：RuntimeException
        }

        User u2 = new User();
        u2.setName("陈");
        u2.setAge(20);
        userDao.save(u2);
    }

    public void saveUserThrowException() throws Exception
    {
        User u1 = new User();
        u1.setName("邵");
        u1.setAge(24);
        userDao.save(u1);

        if (1 + 1 > 1)
        {
            throw new Exception("Runtime error...");//抛出一般的异常：Exception
        }

        User u2 = new User();
        u2.setName("陈");
        u2.setAge(20);
        userDao.save(u2);
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    public void findUsers()
    {
        List<User> users = userDao.query("select * from t_user where age>?", new Object[]{17});
        for (User user : users)
        {
            System.out.println(user);
        }

    }

    //setter getter略
}