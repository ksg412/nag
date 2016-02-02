package com.easysport.b40.setup.dao;

import com.easysport.b40.member.vo.MemberVo;
import com.easysport.b40.setup.vo.SetupVo;

/**
 * @Author : sgkim
 * @Date : 2016-02-01
 * @Version : 1.0
 */

public interface SetupDao {
    public SetupVo selectCompanyInfo(MemberVo memberVo) throws Exception;

    public int updateCompany(SetupVo setupVo) throws Exception;
}