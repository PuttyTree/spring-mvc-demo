package com.bkm.spring.controller;


import com.bkm.spring.model.DataBinderTestModel;
import com.bkm.spring.model.PhoneNumberModel;
import com.bkm.spring.controller.support.editor.PhoneNumberEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DataBinderTestController
{

    @RequestMapping(value = "/dataBind")
	@ResponseBody
    public String test(DataBinderTestModel command, Model model) {
        
    	//输出command对象看看是否绑定正确
		System.out.println(command);
		model.addAttribute("dataBinderTest", command);
		return "bind/success";
	}
   
    @InitBinder
   //此处的参数也可以是ServletRequestDataBinder类型
	public void initBinder(ServletRequestDataBinder binder) throws Exception {
		//注册自定义的属性编辑器
		//1、日期
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		CustomDateEditor dateEditor = new CustomDateEditor(df, true);
		//表示如果命令对象有Date类型的属性，将使用该属性编辑器进行类型转换
		binder.registerCustomEditor(Date.class, dateEditor);
		
		//自定义的电话号码编辑器(和【4.16.1、数据类型转换】一样)
		binder.registerCustomEditor(PhoneNumberModel.class, new PhoneNumberEditor());
	}
}

