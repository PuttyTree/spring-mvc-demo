package com.bkm.spring.controller;

import com.bkm.spring.model.User;
import com.bkm.spring.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Controller
@RequestMapping("/user")
public class UserController
{
    private Logger log = Logger.getLogger(UserController.class);

    @Resource
    private UserService userService;

   /* private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        log.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);
        return "showUser";
    }*/
    @RequestMapping("/showUser")
    @ResponseBody
    public String showUser(Model model){
        try{
            List<User> list = this.userService.getAllUsers();
        /*Map<String,Object> map = new HashMap<String, Object>();*/
            return "success";

        }catch (Exception e){
            System.out.println(e);
            return "failure";

        }

    }
}
