package com.test.model;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/21.
 */
public class User implements Serializable
{
    private Long id;
    private String name;
    private Integer age;

    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String  getName(){
        return  this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Integer getAge(){
        return this.age;
    }
    public void setAge(Integer age ){
        this.age = age;
    }
    //setter getter 略
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
