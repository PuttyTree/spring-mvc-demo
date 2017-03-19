package com;

import com.test.model.Boss;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/3/19.
 */
public class main
{
    @Test
    public void test(){
        ClassPathXmlApplicationContext  ctx  =
                new ClassPathXmlApplicationContext("classpath:spring-mvc-test.xml");

        Boss boss = ctx .getBean(Boss.class);
        System.out.println(boss.toString());
        ctx.destroy();
    }
}
