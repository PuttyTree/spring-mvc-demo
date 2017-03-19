package com.test.model;

import com.test.model.Car;
import com.test.model.Office;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/3/19.
 */
@Component("boss")
public class Boss
{
    //自动注入类型为 Car 的 Bean
    @Resource
    private Car car;

    //自动注入bean名称为office的Bean
    @Resource(name = "office")
    private Office office;

    @PostConstruct
    public void postConstruct1(){
        System.out.println("postConstruct1");
    }
    @PreDestroy
    public void preDestroy1(){
        System.out.println("preDestroy1");
    }
    @Override
    public String toString() {
        return "car:" + car + "\n" + "office:" + office;
    }
}
