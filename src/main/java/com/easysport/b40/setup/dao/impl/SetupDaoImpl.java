package com.easysport.b40.setup.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.easysport.b40.member.vo.MemberVo;
import com.easysport.b40.setup.dao.SetupDao;
import com.easysport.b40.setup.vo.SetupVo;

/**
 * @Author : sgkim
 * @Date : 2016-02-01
 * @Version : 1.0
 */

@Repository
public class SetupDaoImpl extends SqlSessionDaoSupport implements SetupDao {
    public SetupVo selectCompanyInfo(MemberVo memberVo) throws Exception{
        return getSqlSession().selectOne("setup.selectCompanyInfo",memberVo);
    }

    public int updateCompany(SetupVo setupVo) throws Exception {
        return getSqlSession().update("setup.updateCompany", setupVo);
    }
}