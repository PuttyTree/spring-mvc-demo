package com.bkm.spring.service;


import com.bkm.spring.model.Permission;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public interface PermissionService {
    public Long createPermission(Permission permission);
    public void deletePermission(Long permissionId);
}
