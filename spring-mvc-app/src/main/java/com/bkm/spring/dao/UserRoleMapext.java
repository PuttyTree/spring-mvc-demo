package com.bkm.spring.dao;

import com.bkm.spring.model.UserRoleKey;
import org.springframework.stereotype.Repository;

/**
 * Created by yongli.chen on 2017/7/19.
 */
public interface UserRoleMapext {
	
	int count(UserRoleKey record);

	void deleteAll();
}
