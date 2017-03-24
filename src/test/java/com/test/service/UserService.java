package com.test.service;

/**
 * Created by Administrator on 2017/3/21.
 */
public interface UserService
{
    void saveUser();
    void saveUserThrowException() throws Exception;
    void findUsers();
}
