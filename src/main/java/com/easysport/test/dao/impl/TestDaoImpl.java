package com.easysport.test.dao.impl;

import com.easysport.test.dao.TestDao;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * @Author : sgkim
 * @Date : 2016-02-01
 * @Version : 1.0
 */

@Repository
public class TestDaoImpl extends SqlSessionDaoSupport implements TestDao {

}