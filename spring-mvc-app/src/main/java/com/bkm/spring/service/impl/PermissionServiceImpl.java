package com.bkm.spring.service.impl;

import com.bkm.spring.dao.PermissionMapext;
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
    @Resource
    private PermissionMapext permissionMapext;
    //private PermissionDao permissionDao = new PermissionDaoImpl();

    public Long createPermission(Permission permission) {
        long id = permissionMapext.createPermission(permission);

        return new Long(id);
        //return new Long(permissionMapper.insertSelective(permission));
    }

    public void deletePermission(Long permissionId) {
        //permissionDao.deletePermission(permissionId);
        //permissionDao.deletePermission(permissionId);
        permissionMapper.deleteByPrimaryKey(permissionId);
    }
}
