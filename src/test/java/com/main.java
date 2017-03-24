package com;

import com.bkm.spring.tuser.entity.TUser;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Administrator on 2017/3/19.
 */

public class main
{
    public class TUser
    {
        private int id = 1;
        private String name = "tom";
        private String gender = "女";

        public int getId()
        {
            return id;
        }

        public void setId(int id)
        {
            this.id = id;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getGender()
        {
            return gender;
        }

        public void setGender(String gender)
        {
            this.gender = gender;
        }

        public TUser(int id, String name, String gender)
        {
            this.setId(id);
            this.setName(name);
            this.setGender(gender);
        }
    }

    @Test
    public void test()
    {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("key1", 1);
        map2.put("key2", 2);
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(map);
        list.add(map2);
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println("json字符串:" + json);
        //解析json字符串
        //json字符串:[{"key1":"value1","key2":"value2"},{"key1":1,"key2":2}]
        List<Map<String, Object>> list2 = gson.fromJson(json, new TypeToken<List<Map<String, Object>>>(){}.getType());
    }
}
