package com.easysport.b40.main.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.easysport.b40.main.dao.MainDao;
import com.easysport.b40.main.vo.MainVo;
import com.easysport.b40.member.vo.MemberVo;

/**
 * Created by sgkim on 2016-01-29.
 */
@Repository
public class MainDaoImpl extends SqlSessionDaoSupport implements MainDao {

    public MainVo selectMainInfo(MemberVo memberVo) throws Exception{
        return getSqlSession().selectOne("main.selectMainInfo",memberVo);
    }

}
