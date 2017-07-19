package com.bkm.spring.service.impl;

import com.bkm.spring.dao.UserDao;
import com.bkm.spring.dao.UserMapper;
import com.bkm.spring.model.User;
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


	//private UserDao userDao = new UserDaoImpl();
	private PasswordHelper passwordHelper = new PasswordHelper();

	public List<User> getAllUsers() {

		return userMapper.getAllUsers();
	}

	/**
	 * 创建用户
	 *
	 * @param user
	 */
	public User createUser(User user) {
		//加密密码
		passwordHelper.encryptPassword(user);
		return userMapper.createUser(user);
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
		User user = userMapper.findOne(userId);
		user.setPassword(newPassword);
		passwordHelper.encryptPassword(user);
		userMapper.updateUser(user);
	}

	/**
	 * 添加用户-角色关系
	 *
	 * @param userId
	 * @param roleIds
	 */
	public void correlationRoles(Long userId, Long... roleIds) {
		userMapper.correlationRoles(userId, roleIds);
	}


	/**
	 * 移除用户-角色关系
	 *
	 * @param userId
	 * @param roleIds
	 */
	public void uncorrelationRoles(Long userId, Long... roleIds) {
		userMapper.uncorrelationRoles(userId, roleIds);
	}

	/**
	 * 根据用户名查找用户
	 *
	 * @param username
	 * @return
	 */
	public User findByUsername(String username) {
		return userMapper.findByUsername(username);
	}

	/**
	 * 根据用户名查找其角色
	 *
	 * @param username
	 * @return
	 */
	public Set<String> findRoles(String username) {
		return userMapper.findRoles(username);
	}

	/**
	 * 根据用户名查找其权限
	 *
	 * @param username
	 * @return
	 */
	public Set<String> findPermissions(String username) {
		return userMapper.findPermissions(username);
	}

}



