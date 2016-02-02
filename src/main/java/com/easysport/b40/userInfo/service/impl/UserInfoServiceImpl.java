package com.easysport.b40.userInfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easysport.b40.userInfo.dao.UserInfoDao;
import com.easysport.b40.userInfo.service.UserInfoService;
import com.easysport.b40.userInfo.vo.UserInfoVo;

/**
 * Created by sgkim on 2016-01-26.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    public void insertUserRegistInfo(UserInfoVo userInfoVo) throws Exception{
        userInfoDao.insertUserRegistInfo(userInfoVo);
    }

    public int selectEmailOverlabCheck(String email) throws Exception{
        return userInfoDao.selectEmailOverlabCheck(email);
    }

    public UserInfoVo selectUserInfo(String email) throws Exception{
        return userInfoDao.selectUserInfo(email);
    }

    public int updateUserInfo(UserInfoVo userInfoVo) throws Exception{
        return userInfoDao.updateUserInfo(userInfoVo);
    }
}
