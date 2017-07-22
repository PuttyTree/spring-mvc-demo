package com.shiro;import com.bkm.spring.dao.*;import com.bkm.spring.model.Permission;import com.bkm.spring.model.Role;import com.bkm.spring.model.User;import com.bkm.spring.service.PermissionService;import com.bkm.spring.service.RoleService;import com.bkm.spring.service.UserService;import org.apache.shiro.SecurityUtils;import org.apache.shiro.authc.UsernamePasswordToken;import org.apache.shiro.config.IniSecurityManagerFactory;import org.apache.shiro.subject.Subject;import org.apache.shiro.util.Factory;import org.apache.shiro.util.ThreadContext;import org.junit.After;import org.junit.Before;import org.junit.runner.RunWith;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.test.context.ContextConfiguration;import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;import javax.annotation.Resource;import java.util.List;/** * <p>User: Zhang Kaitao * <p>Date: 14-1-28 * <p>Version: 1.0 */@RunWith(SpringJUnit4ClassRunner.class)@ContextConfiguration(locations = {	"classpath:application-test.xml"})public abstract class BaseTest {	@Autowired	UserService userService;	@Autowired	RoleService roleService;	@Autowired	PermissionService permissionService;	@Resource	private UserMapper userMapper;	@Resource	private UserMapext userMapext;	@Resource	public PermissionMapext permissionMapext;	@Resource	public PermissionMapper permissionMapper;	@Resource	public RoleMapper roleMapper;	@Resource	public RoleMapext roleMapext;	@Resource	public RolePermissionMapper rolePermissionMapper;	@Resource	private RolePermissionMapext rolePermissionMapext;	@Resource	public UserRoleMapper userRoleMapper;	@Resource	public UserRoleMapext userRoleMapext;	protected String password = "123";	protected Permission p1;	protected Permission p2;	protected Permission p3;	protected Role r1;	protected Role r2;	protected User u1;	protected User u2;	protected User u3;	protected User u4;	@Before	public void setUp() {	/*	JdbcTemplateUtils.jdbcTemplate().update("delete from sys_users");		JdbcTemplateUtils.jdbcTemplate().update("delete from sys_roles");		JdbcTemplateUtils.jdbcTemplate().update("delete from sys_permissions");		JdbcTemplateUtils.jdbcTemplate().update("delete from sys_users_roles");		JdbcTemplateUtils.jdbcTemplate().update("delete from sys_roles_permissions");*//*		userMapext.deleteAll();		roleMapext.deleteAll();		permissionMapext.deleteAll();		userRoleMapext.deleteAll();		rolePermissionMapext.deleteAll();*/		//1、新增权限		p1 = new Permission();		p1.setId(new Long(76));		p1.setPermission("user.create");		p1.setDescription("用户模块新增");		p1.setAvailable(true);		p2 = new Permission();		p2.setId(new Long(77));		p2.setPermission("user:update");		p2.setDescription("用户模块修改");		p2.setAvailable(true);		p3 = new Permission();		p3.setId(new Long(78));		p3.setPermission("menu:create");		p3.setDescription("菜单模块新增");		p3.setAvailable(true);		//permissionService.createPermission(p1);		//permissionService.createPermission(p2);		//permissionService.createPermission(p3);		//2、新增角色		r1 = new Role();		r1.setId(new Long(47));		r1.setRole("admin");		r1.setDescription("管理员");		r1.setAvailable(true);		r2 = new Role();		r2.setId(new Long(48));		r2.setRole("user");		r2.setDescription("用户管理员");		r2.setAvailable(true);		//roleService.createRole(r1);		//roleService.createRole(r2);		//3、关联角色-权限		/*roleService.correlationPermissions(r1.getId(), p1.getId());		roleService.correlationPermissions(r1.getId(), p2.getId());		roleService.correlationPermissions(r1.getId(), p3.getId());		roleService.correlationPermissions(r2.getId(), p1.getId());		roleService.correlationPermissions(r2.getId(), p2.getId());*/		//4、新增用户		u1 = new User();		u1.setId(new Long(41));		u1.setUsername("zhang");		u1.setPassword(password);		u2 = new User();		u2.setId(new Long(42));		u2.setUsername("li");		u2.setPassword(password);		u3 = new User();		u3.setId(new Long(43));		u3.setUsername("wu");		u3.setPassword(password);		u4 = new User();		u4.setId(new Long(44));		u4.setUsername("wang");		u4.setPassword(password);		u4.setLocked(Boolean.TRUE);		/*userService.createUser(u1);		userService.createUser(u2);		userService.createUser(u3);		userService.createUser(u4);*/		//5、关联用户-角色		//userService.correlationRoles(u1.getId(), r1.getId());	}	@After	public void tearDown() throws Exception {		ThreadContext.unbindSubject();//退出时请解除绑定Subject到线程 否则对下次测试造成影响	}	protected void login(String configFile, String username, String password) {		//1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager		Factory<org.apache.shiro.mgt.SecurityManager> factory =			new IniSecurityManagerFactory(configFile);		//2、得到SecurityManager实例 并绑定给SecurityUtils		org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();		SecurityUtils.setSecurityManager(securityManager);		//3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）		Subject subject = SecurityUtils.getSubject();		UsernamePasswordToken token = new UsernamePasswordToken(username, password);		subject.login(token);	}	public Subject subject() {		return SecurityUtils.getSubject();	}}