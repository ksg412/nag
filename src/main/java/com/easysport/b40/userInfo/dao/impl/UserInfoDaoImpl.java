package com.easysport.b40.userInfo.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.easysport.b40.userInfo.dao.UserInfoDao;
import com.easysport.b40.userInfo.vo.UserInfoVo;

/**
 * Created by sgkim on 2016-01-26.
 */
@Repository
public class UserInfoDaoImpl extends SqlSessionDaoSupport implements UserInfoDao {
    public void insertUserRegistInfo(UserInfoVo userInfoVo) throws Exception{
        getSqlSession().insert("userInfo.insertUserRegistInfo", userInfoVo);
    }

    public int selectEmailOverlabCheck(String email) throws Exception{
        return getSqlSession().selectOne("userInfo.selectEmailOverlabCheck", email);
    }

    public UserInfoVo selectUserInfo(String email) throws Exception{
        return getSqlSession().selectOne("userInfo.selectUserInfo", email);
    }

    public int updateUserInfo(UserInfoVo userInfoVo) throws Exception{
        return getSqlSession().update("userInfo.updateUserInfo",userInfoVo);
    }
}
