package com.bkm.spring.filter;

/**
 * Created by yongli.chen on 2017/4/11.
 */
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class Demo1Filter implements Filter {
    private FilterConfig filterConfig;

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        System.out.println("Demo1过滤前");
        System.out.println(filterConfig.getInitParameter("param1"));
        chain.doFilter(request, response);//放行。让其走到下个链或目标资源中
        System.out.println("Demo1过滤后");
    }

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化了");
        this.filterConfig = filterConfig;
    }

    public void destroy() {
        System.out.println("销毁了");
    }

}





