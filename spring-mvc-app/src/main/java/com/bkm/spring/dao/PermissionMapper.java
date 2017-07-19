package com.bkm.spring.dao;

import com.bkm.spring.model.Permission;

public interface PermissionMapper {
    
    int deleteByPrimaryKey(Long id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    //extension
    //public Permission createPermission(Permission permission);

    //public void deletePermission(Long permissionId);

}