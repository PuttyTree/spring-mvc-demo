package com;

import com.test.model.Boss;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


/**
 * Created by Administrator on 2017/3/19.
 */
public class main
{
    public DriverManagerDataSource getMysqlDataSource()
    {
        //1.首先启动mysql（本书使用5.4.3版本），其次登录mysql创建test数据库
        String url = "jdbc:mysql://localhost:3306/test";
        //在进行测试前，请下载并添加mysql-connector-java-5.1.10.jar到classpath
        DriverManagerDataSource dataSource = new DriverManagerDataSource(url, "root", "123456");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }


    @Test
    public void test()
    {
       /* ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-mvc-test.xml");

        Boss boss = ctx.getBean(Boss.class);
        System.out.println(boss.toString());
        ctx.destroy();*/
        JdbcTemplate mysqlJdbcTemplate = new JdbcTemplate(this.getMysqlDataSource());
    }
}
