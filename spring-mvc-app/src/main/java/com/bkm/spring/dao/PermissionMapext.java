package com.bkm.spring.dao;

import com.bkm.spring.model.Permission;

/**
 * Created by Administrator on 2017/7/22.
 */
public interface PermissionMapext {
	void deleteAll();

	/*
	* 插入对象，并主键存储在该对象中
	* */
	Long createPermission(Permission permission);

}
