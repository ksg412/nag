package com.easysport.angularServerSide.test.dao;

/**
 * Created by sg on 2016-02-14.
 */
public interface AngularjsDao {

    public void insertRegId(String regId) throws Exception;
    public void updateRegIdCancel(String regId) throws Exception;
    public int selectOverlabCheck(String regId) throws Exception;
    public void updateRegIdRegist(String regId) throws Exception;
}
