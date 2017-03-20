package com.test.dao.impl;

import com.test.dao.NewsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/3/19.
 */
@Repository("myNewsDao")
@Scope("prototype")
public class NewsDaoImpl implements NewsDao
{
}
