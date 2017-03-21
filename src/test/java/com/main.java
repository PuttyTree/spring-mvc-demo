package com;

import com.test.service.IUserService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


/**
 * Created by Administrator on 2017/3/19.
 */
public class main
{
    private static ApplicationContext ctx = null;

    @BeforeClass //表示在所以测试方法之前执行，且只执行一次。
    public static void onlyOnce()
    {
        ctx = new ClassPathXmlApplicationContext("classpath:applicationContext-jdbc.xml");
    }

    @Test
    public void testSave()
    {
        IUserService service = ctx.getBean("userService", IUserService.class);
        service.saveUser();
    }

    @Test
    public void testSaveThrowException() throws Exception
    {
        IUserService service = ctx.getBean("userService", IUserService.class);
        service.saveUserThrowException();
    }

    @Test
    public void testJDBCDaoQuery()
    {
        IUserService service = ctx.getBean("userService", IUserService.class);
        service.findUsers();
    }
}
