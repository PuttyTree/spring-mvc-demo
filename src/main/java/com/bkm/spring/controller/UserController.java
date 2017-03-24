package com.bkm.spring.controller;

import com.bkm.spring.model.User;
import com.bkm.spring.rest.ApiRequest;
import com.bkm.spring.rest.ApiResponse;
import com.bkm.spring.rest.ErrorCode;
import com.bkm.spring.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bkm.spring.gson.GsonEnumTypeAdapter;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Controller
@RequestMapping("/user")
public class UserController
{
    private Logger logger = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public @ResponseBody ApiResponse showUser(){
        try{
            List<User> list = this.userService.getAllUsers();
            return ApiResponse.success(list).setMsg(new String[]{"获取数据成功"});
        }
        catch (Exception e){
            logger.fatal(e);
            logger.error(String.format("%s  %s ", ErrorCode.BIZ_ERROR.getMsg(), e.getMessage()));
            return ApiResponse.fail(ErrorCode.BIZ_ERROR,e.getMessage());
        }

    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public @ResponseBody ApiResponse addUser(User user){
        try{
            if (user == null || user.getId() < 1){
                return ApiResponse.fail(ErrorCode.INVALID_REQUEST_PARAMETER_COUNT,"不正确的ID");
            }
            int index = this.userService.insert(user.getId(), user.getName(), user.getPhone());
            if (index < 1){
                return ApiResponse.fail(ErrorCode.INVALID_REQUEST_PARAMETER_COUNT,"该ID号已存在");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("index", index);
            return ApiResponse.success(map).setMsg(new String[]{"添加数据成功"});
        }
        catch (Exception e){
            return ApiResponse.fail(ErrorCode.BIZ_ERROR,e.getMessage());
        }

    }
}
