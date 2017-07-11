package com.bkm.spring.service;

/**
 * Created by yongli.chen on 2017/7/11.
 */
public interface HelloWorldService {
	void save(String name);
	void update(String name, Integer id);
	String getPersonName(Integer id);
}
