package com.bkm.spring.model;

public class RolePermissionKey {
	private Long roleId;

	private Long permissionId;

	public Long getRoleId() {
		return roleId;
	}

	public RolePermissionKey setRoleId(Long roleId) {
		this.roleId = roleId;
		return this;
	}

	public Long getPermissionId() {
		return permissionId;
	}

	public RolePermissionKey setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
		return this;
	}
}