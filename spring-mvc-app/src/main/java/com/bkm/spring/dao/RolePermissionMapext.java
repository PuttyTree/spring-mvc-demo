package com.bkm.spring.dao;

import com.bkm.spring.model.RolePermissionKey;
import org.springframework.stereotype.Repository;

/**
 * Created by yongli.chen on 2017/7/19.
 */
public interface RolePermissionMapext {
	int count(RolePermissionKey record);
	void deleteAll();
}
