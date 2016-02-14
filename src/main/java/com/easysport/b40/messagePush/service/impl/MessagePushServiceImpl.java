package com.easysport.b40.messagePush.service.impl;

import com.easysport.b40.messagePush.dao.MessagePushDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easysport.b40.messagePush.service.MessagePushService;

import java.util.List;

/**
 * @Author : sgkim
 * @Date : 2016-02-12
 * @Version : 1.0
 */


@Service
public class MessagePushServiceImpl implements MessagePushService {

    @Autowired
    MessagePushDao messagePushDao;

    public List<String> getRegIdListPushY() throws Exception{
        return messagePushDao.getRegIdListPushY();
    }
}