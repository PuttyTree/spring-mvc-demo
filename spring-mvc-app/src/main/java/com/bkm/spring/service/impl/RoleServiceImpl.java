package com.bkm.spring.service.impl;

/*import com.github.zhangkaitao.shiro.chapter6.dao.RoleDao;
import com.github.zhangkaitao.shiro.chapter6.dao.RoleDaoImpl;
import com.github.zhangkaitao.shiro.chapter6.entity.Role;*/

import com.bkm.spring.dao.RoleDao;
import com.bkm.spring.dao.RoleMapper;
import com.bkm.spring.dao.RolePermissionMapper;
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
	private RolePermissionMapper rolePermissionMapper;


	public int createRole(Role role) {

		//return roleDao.createRole(role);
		return roleMapper.insert(role);
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
			if (rolePermissionMapper.count(key) < 1)
				rolePermissionMapper.insert(key);
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
