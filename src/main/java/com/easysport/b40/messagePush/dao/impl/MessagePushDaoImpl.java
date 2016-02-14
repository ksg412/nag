package com.easysport.b40.messagePush.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.easysport.b40.messagePush.dao.MessagePushDao;

import java.util.List;

/**
 * @Author : sgkim
 * @Date : 2016-02-12
 * @Version : 1.0
 */

@Repository
public class MessagePushDaoImpl extends SqlSessionDaoSupport implements MessagePushDao {

    public List<String> getRegIdListPushY() throws Exception{
        return getSqlSession().selectList("messagePush.getRegIdListPushY");
    }
}