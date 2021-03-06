package com.bkm.spring.service.impl;

import com.bkm.spring.dao.*;
import com.bkm.spring.model.Role;
import com.bkm.spring.model.RolePermissionKey;
import com.bkm.spring.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
@Service
public class RoleServiceImpl implements RoleService {

	@Resource
	private RoleMapper roleMapper;
	@Resource
	private RoleMapext roleMapext;

	@Resource
	private RolePermissionMapper rolePermissionMapper;
	@Resource
	private RolePermissionMapext rolePermissionMapext;


	public Long createRole(Role role) {

		//return roleDao.createRole(role);
		return roleMapext.createRole(role);
	}

	public void deleteRole(Long roleId) {
		//roleDao.deleteRole(roleId);
		//roleDao.deleteRole(roleId);
		roleMapper.deleteByPrimaryKey(roleId);
	}

	/**
	 * 添加角色-权限之间关系
	 *
	 * @param roleId
	 * @param permissionIds
	 */
	public void correlationPermissions(Long roleId, Long... permissionIds) {
		//roleDao.correlationPermissions(roleId, permissionIds);
		if (permissionIds == null || permissionIds.length == 0) {
			return;
		}
		for (Long permissionId : permissionIds) {
			RolePermissionKey key = new RolePermissionKey();
			key.setRoleId(roleId).setPermissionId(permissionId);
			if (rolePermissionMapext.count(key) < 1)
				rolePermissionMapper.insertSelective(key);
		}
	}

	/**
	 * 移除角色-权限之间关系
	 *
	 * @param roleId
	 * @param permissionIds
	 */
	public void uncorrelationPermissions(Long roleId, Long... permissionIds) {
		//roleDao.uncorrelationPermissions(roleId, permissionIds);
		if (permissionIds == null || permissionIds.length == 0) {
			return;
		}
		for (Long permissionId : permissionIds) {
			RolePermissionKey key = new RolePermissionKey();
			key.setRoleId(roleId).setPermissionId(permissionId);
			rolePermissionMapper.deleteByPrimaryKey(key);
		}

	}

}
