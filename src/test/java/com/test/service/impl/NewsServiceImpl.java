package com.test.service.impl;

import com.test.dao.NewsDao;
import com.test.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/19.
 */
@Service("myNewsService")
@Scope("prototype")
public class NewsServiceImpl implements NewsService
{

    @Autowired
    @Qualifier("myNewsDao")
    private NewsDao nd;
}
