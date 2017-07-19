package com.bkm.spring.service.impl;

import com.bkm.spring.dao.PermissionMapper;
import com.bkm.spring.model.Permission;
import com.bkm.spring.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
//import com.github.zhangkaitao.shiro.chapter6.dao.PermissionDao;
//import com.github.zhangkaitao.shiro.chapter6.dao.PermissionDaoImpl;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Resource
    private PermissionMapper permissionMapper;
    //private PermissionDao permissionDao = new PermissionDaoImpl();

    public int createPermission(Permission permission) {

        //return permissionDao.createPermission(permission);
        return permissionMapper.insert(permission);
    }

    public void deletePermission(Long permissionId) {
        //permissionDao.deletePermission(permissionId);
        //permissionDao.deletePermission(permissionId);
        permissionMapper.deleteByPrimaryKey(permissionId);
    }
}
