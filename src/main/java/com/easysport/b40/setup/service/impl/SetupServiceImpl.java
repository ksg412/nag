package com.easysport.b40.setup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easysport.b40.member.vo.MemberVo;
import com.easysport.b40.setup.dao.SetupDao;
import com.easysport.b40.setup.service.SetupService;
import com.easysport.b40.setup.vo.SetupVo;

/**
 * @Author : sgkim
 * @Date : 2016-02-01
 * @Version : 1.0
 */
@Service
public class SetupServiceImpl implements SetupService {

    @Autowired
    SetupDao setupDao;

    public SetupVo selectCompanyInfo(MemberVo memberVo) throws Exception{
        return setupDao.selectCompanyInfo(memberVo);
    }

    public int updateCompany(SetupVo setupVo) throws Exception{
        return setupDao.updateCompany(setupVo);
    }
}