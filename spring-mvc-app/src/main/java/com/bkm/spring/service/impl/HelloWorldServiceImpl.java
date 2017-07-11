package com.bkm.spring.service.impl;

import com.bkm.spring.service.HelloWorldService;
import org.springframework.stereotype.Service;

/**
 * Created by yongli.chen on 2017/7/11.
 */
@Service
public class HelloWorldServiceImpl implements HelloWorldService {
	@Override
	public void save(String name) {
		System.out.println("我是save方法");
	}

	@Override
	public void update(String name, Integer id) {
		System.out.println("我是update()方法");
	}

	@Override
	public String getPersonName(Integer id) {

		System.out.println("我是getPersonName()方法");
		return "xxx";
	}
}
