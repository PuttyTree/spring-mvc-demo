package com.bkm.spring.dao;

import com.bkm.spring.model.UserRoleKey;
import org.springframework.stereotype.Repository;

public interface UserRoleMapper {
    int deleteByPrimaryKey(UserRoleKey key);

    int insert(UserRoleKey record);

    int insertSelective(UserRoleKey record);
}