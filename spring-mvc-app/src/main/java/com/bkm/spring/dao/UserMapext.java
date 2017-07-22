package com.bkm.spring.dao;

import com.bkm.spring.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * Created by yongli.chen on 2017/7/19.
 */
public interface UserMapext {
	List<User> getAllUsers();

	void deleteAll();

	public Long createUser(User user);

	public void updateUser(User user);

	public void deleteUser(Long userId);

	public void correlationRoles(Long userId, Long... roleIds);

	/**
	 * 移除用户-角色关系
	 * @param userId
	 * @param roleIds
	 */
	public void uncorrelationRoles(Long userId, Long... roleIds);

	User findOne(Long userId);

	User findByUsername(String username);

	Set<String> findRoles(String username);

	Set<String> findPermissions(String username);
}
