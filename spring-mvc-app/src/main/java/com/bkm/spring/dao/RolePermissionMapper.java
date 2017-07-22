package com.bkm.spring.dao;

import com.bkm.spring.model.RolePermissionKey;
import org.springframework.stereotype.Repository;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(RolePermissionKey key);

    int insert(RolePermissionKey record);

    int insertSelective(RolePermissionKey record);


}