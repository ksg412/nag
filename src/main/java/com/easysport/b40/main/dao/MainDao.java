package com.easysport.b40.main.dao;

import com.easysport.b40.main.vo.MainVo;
import com.easysport.b40.member.vo.MemberVo;

/**
 * Created by sgkim on 2016-01-29.
 */
public interface MainDao {
    public MainVo selectMainInfo(MemberVo memberVo) throws Exception;
}
