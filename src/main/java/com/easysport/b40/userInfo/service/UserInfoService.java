package com.easysport.b40.userInfo.service;

import com.easysport.b40.userInfo.vo.UserInfoVo;

/**
 * Created by sgkim on 2016-01-26.
 */

public interface UserInfoService {

    public void insertUserRegistInfo(UserInfoVo userInfoVo) throws Exception;

    public int selectEmailOverlabCheck(String email) throws Exception;

    public UserInfoVo selectUserInfo(String email) throws Exception;

    public int updateUserInfo(UserInfoVo userInfoVo) throws Exception;

}
