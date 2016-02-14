package com.easysport.angularServerSide.test.dao.impl;

import com.easysport.angularServerSide.test.dao.AngularjsDao;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Created by sg on 2016-02-14.
 */
@Repository
public class AngularjsDaoImpl extends SqlSessionDaoSupport implements AngularjsDao {

    public void insertRegId(String regId) throws Exception{
        getSqlSession().insert("angularjs.insertRegId",regId);
    }

    public void updateRegIdCancel(String regId) throws Exception{
        getSqlSession().update("angularjs.updateRegIdCancel",regId);
    }
}
