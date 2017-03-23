package com;

import com.test.service.UserService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by Administrator on 2017/3/19.
 */
public class main
{
    private static ApplicationContext ctx = null;

    @BeforeClass //表示在所以测试方法之前执行，且只执行一次。
    public static void onlyOnce()
    {
        String[] configLocations = new String[]{"classpath:application.xml"};
        ctx = new ClassPathXmlApplicationContext(configLocations);
    }

    @Test
    public void testSave()
    {
        UserService service = ctx.getBean("userService", UserService.class);
        service.saveUser();
    }

    @Test
    public void testSaveThrowException() throws Exception
    {
        UserService service = ctx.getBean("userService", UserService.class);
        service.saveUserThrowException();
    }

    @Test
    public void testJDBCDaoQuery()
    {
        UserService service = ctx.getBean("userService", UserService.class);
        service.findUsers();
    }
}
