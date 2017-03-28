package com.bkm.redis.model;

import java.io.Serializable;

/**
 * Created by yongli.chen on 2017/3/28.
 */
public class User implements Serializable
{

    private static final long serialVersionUID = -6011241820070393952L;

    private String id;

    private String name;

    private String password;
    public User() {

    }
    public User(String id, String name, String password) {
        super();
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    /**
     * 设置name
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获得password
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}