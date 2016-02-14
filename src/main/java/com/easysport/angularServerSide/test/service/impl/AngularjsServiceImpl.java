package com.easysport.angularServerSide.test.service.impl;

import com.easysport.angularServerSide.test.dao.AngularjsDao;
import com.easysport.angularServerSide.test.service.AngularjsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sg on 2016-02-14.
 */
@Service
public class AngularjsServiceImpl implements AngularjsService{

    @Autowired
    AngularjsDao angularjsDao;

    public void insertRegId(String regId) throws Exception{
        if(angularjsDao.selectOverlabCheck(regId) == 0){
          angularjsDao.insertRegId(regId);
        }else{
          angularjsDao.updateRegIdRegist(regId);
        }

    }

    public void updateRegIdCancel(String regId) throws Exception{
        angularjsDao.updateRegIdCancel(regId);
    }
}
