package com.bkm.spring.service;

import com.bkm.spring.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/3/19.
 */

public interface UserService{
    List<User> getAllUsers();

    User getUserByPhoneOrEmail(String emailOrPhone);

    User getUserById(int id);

    int insert(int id,String name,String phone);
}

