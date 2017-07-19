package com.bkm.spring.dao;

import com.bkm.spring.model.RolePermissionKey;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(RolePermissionKey key);

    int insert(RolePermissionKey record);

    int insertSelective(RolePermissionKey record);

    int count(RolePermissionKey record);
}