package com.bkm.spring.dao;

import com.bkm.spring.model.UserRoleKey;

/**
 * Created by yongli.chen on 2017/7/19.
 */
public interface UserRoleMapext {
	
	int count(UserRoleKey record);

	void deleteAll();
}
