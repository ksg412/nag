package com.easysport.b40.main.service;

import com.easysport.b40.main.vo.MainVo;
import com.easysport.b40.member.vo.MemberVo;

/**
 * Created by sgkim on 2016-01-29.
 */
public interface MainService {
    public MainVo selectMainInfo(MemberVo memberVo) throws Exception;
}
