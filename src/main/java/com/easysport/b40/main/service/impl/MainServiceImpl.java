package com.easysport.b40.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easysport.b40.main.dao.MainDao;
import com.easysport.b40.main.service.MainService;
import com.easysport.b40.main.vo.MainVo;
import com.easysport.b40.member.vo.MemberVo;

/**
 * Created by sgkim on 2016-01-29.
 */
@Service
public class MainServiceImpl implements MainService{

    @Autowired
    MainDao mainDao;

    public MainVo selectMainInfo(MemberVo memberVo) throws Exception{
        return mainDao.selectMainInfo(memberVo);
    }
}
