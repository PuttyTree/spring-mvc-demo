package com.bkm.spring.dao;

import com.bkm.spring.model.Role;

/**
 * Created by Administrator on 2017/7/22.
 */
public interface RoleMapext {

	void  deleteAll();

	/*
	* 主键存入该对象中
	* */
	Long createRole(Role role);
}
