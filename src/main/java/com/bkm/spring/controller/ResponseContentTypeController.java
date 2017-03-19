package com.bkm.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ResponseContentTypeController
{

    @RequestMapping(value ="/response/ContentType")
    @ResponseBody
    public Map response1(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
        //1：表示响应的内容区数据的媒体类型为html格式，且编码为utf-8(客户端应该以utf-8解码)
        //response.setContentType("text/html;charset=utf-8");
        //2：写出响应体内容
        //response.getWriter().write("<font style='color:red'>hello</font>");

        response.setHeader("Access-Control-Allow-Origin","*");
        System.out.println(request.getParameter("username"));
        System.out.println(request.getParameter("password"));

        String jsonData = "{\"username\":\"zhang\", \"password\":\"123\"}";
        //response.getWriter().write(jsonData);
        Map<String, Object> map = new HashMap();
        map.put("user", "zhangsan");
        map.put("age", 20);
        return map;
    }


   @RequestMapping(value = "/response/ContentType", headers = "Accept=application/json")
    @ResponseBody
    public Map response2(HttpServletResponse response) throws IOException
    {
        //1：表示响应的内容区数据的媒体类型为json格式，且编码为utf-8(客户端应该以utf-8解码)
        response.setContentType("application/json;charset=utf-8");
        //2：写出响应体内容
        String jsonData = "{\"username\":\"zhang\", \"password\":\"123\"}";
        //response.getWriter().write(jsonData);
        Map<String, Object> map = new HashMap();
        map.put("user", "zhangsan");
        map.put("age", 20);
        return map;

    }

   /*  @RequestMapping(value = "/response/ContentType", headers = "Accept=application/xml")
    @ResponseBody
    public void response3(HttpServletResponse response) throws IOException
    {
        //1：表示响应的内容区数据的媒体类型为xml格式，且编码为utf-8(客户端应该以utf-8解码)
        response.setContentType("application/xml;charset=utf-8");
        //2：写出响应体内容
        String xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        xmlData += "<user><username>zhang</username><password>123</password></user>";
        response.getWriter().write(xmlData);
    }*/

}
