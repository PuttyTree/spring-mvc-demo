package com.bkm.spring.dao;

import com.bkm.spring.model.Permission;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/7/22.
 */
@Repository
public interface PermissionMapext {
	void deleteAll();

	/*
	* 插入对象，并主键存储在该对象中
	* */
	Long createPermission(Permission permission);

}
