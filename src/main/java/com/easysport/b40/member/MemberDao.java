package com.easysport.b40.member;

import com.easysport.b40.member.vo.MemberVo;

public interface MemberDao {
	public MemberVo getLoginUserInfo(String userid);
}
