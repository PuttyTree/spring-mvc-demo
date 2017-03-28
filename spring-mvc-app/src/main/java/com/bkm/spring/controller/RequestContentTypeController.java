package com.bkm.spring.controller;

import com.bkm.spring.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.List;
import java.util.Map;

@Controller
public class RequestContentTypeController
{
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public String showForm(@RequestHeader("User-Agent") String userAgent,
                           @RequestHeader(value = "Accept") String[] accepts) throws IOException
    {
        return "consumesproduces/Content-Type";
    }

    @RequestMapping(value = "/request/ContentType", method = RequestMethod.POST,
            headers = "Content-Type=application/x-www-form-urlencoded")
    @ResponseBody
    public String request1(HttpServletRequest request) throws IOException
    {
        //1:得到请求的内容区数据的类型
        String contentType = request.getContentType();
        System.out.println("========ContentType:" + contentType);
        //2:得到请求的内容区数据的编码方式，如果请求中没有指定则为null
        //注意，我们的CharacterEncodingFilter这个过滤器设置了编码(UTF-8)
        //编码只能被指定一次，即如果客户端设置了编码，则过滤器不会再设置
        String characterEncoding = request.getCharacterEncoding();
        System.out.println("========CharacterEncoding:" + characterEncoding);

        //3:表示请求的内容区数据为form表单提交的参数，此时我们可以通过request.getParameter得到数据（key=value）
        System.out.println(request.getParameter("username"));
        System.out.println(request.getParameter("password"));
        return "success";
    }

    @RequestMapping(value = "/user")
    @ResponseBody
    public String request2(@ModelAttribute("user") UserModel user) throws IOException
    {
        System.out.println(user.toString());
        return "success";
    }

}
