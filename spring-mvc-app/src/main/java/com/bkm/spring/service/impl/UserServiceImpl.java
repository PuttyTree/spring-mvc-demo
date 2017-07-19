package com.bkm.spring.service.impl;

import com.bkm.spring.dao.*;
import com.bkm.spring.model.User;
import com.bkm.spring.model.UserRoleKey;
import com.bkm.spring.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2017/3/19.
 */
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	@Resource
	private UserMapext userMapext;

	@Resource
	private UserRoleMapper userRoleMapper;

	@Resource
	private UserRoleMapext userRoleMapext;


	//private UserDao userDao = new UserDaoImpl();
	private PasswordHelper passwordHelper = new PasswordHelper();

	public List<User> getAllUsers() {
		return userMapext.getAllUsers();
	}

	/**
	 * 创建用户
	 *
	 * @param user
	 */
	public int createUser(User user) {
		//加密密码
		passwordHelper.encryptPassword(user);
		return userMapper.insert(user);
	}

	public int insert(User user) {
		//return userDao.insert(user);
		return -1;
	}

	/**
	 * 修改密码
	 *
	 * @param userId
	 * @param newPassword
	 */
	public void changePassword(Long userId, String newPassword) {
		User user = userMapper.selectByPrimaryKey(userId);
		user.setPassword(newPassword);
		passwordHelper.encryptPassword(user);
		userMapper.updateByPrimaryKey(user);
	}

	/**
	 * 添加用户-角色关系
	 *
	 * @param userId
	 * @param roleIds
	 */
	public void correlationRoles(Long userId, Long... roleIds) {
		if (roleIds == null || roleIds.length == 0) {
			return;
		}
		for (Long roleId : roleIds) {

			UserRoleKey key = new UserRoleKey();
			key.setRoleId(roleId);
			key.setUserId(userId);
			if (userRoleMapext.count(key) < 1)
				userRoleMapper.insert(key);
		}

		//userMapper.correlationRoles(userId, roleIds);
	}


	/**
	 * 移除用户-角色关系
	 *
	 * @param userId
	 * @param roleIds
	 */
	public void uncorrelationRoles(Long userId, Long... roleIds) {
		//userMapper.uncorrelationRoles(userId, roleIds);
		if (roleIds == null || roleIds.length == 0) {
			return;
		}
		for (Long roleId : roleIds) {
			UserRoleKey key = new UserRoleKey();
			key.setRoleId(roleId);
			key.setUserId(userId);
			if (userRoleMapext.count(key) > 0) {
				userRoleMapper.deleteByPrimaryKey(key);
			}
		}


	}

	/**
	 * 根据用户名查找用户
	 *
	 * @param username
	 * @return
	 */
	public User findByUsername(String username) {
		//return userMapper.findByUsername(username);
		return userMapext.findByUsername(username);
	}

	/**
	 * 根据用户名查找其角色
	 *
	 * @param username
	 * @return
	 */
	public Set<String> findRoles(String username) {
		return userMapext.findRoles(username);
	}

	/**
	 * 根据用户名查找其权限
	 *
	 * @param username
	 * @return
	 */
	public Set<String> findPermissions(String username) {
		return userMapext.findPermissions(username);
	}

}



