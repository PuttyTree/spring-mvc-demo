package com.test.controller;

import com.test.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by Administrator on 2017/3/19.
 */
@Controller("myNewsAction")
@Scope("prototype")
public class NewsAction
{

    @Autowired
    @Qualifier("myNewsService")
    private NewsService ns;
}
