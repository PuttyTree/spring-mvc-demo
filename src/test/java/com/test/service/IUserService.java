package com.test.service;

/**
 * Created by Administrator on 2017/3/21.
 */
public interface IUserService
{
    void saveUser();
    void saveUserThrowException() throws Exception;
    void findUsers();
}
