package com.easysport.b40.member;

import com.easysport.b40.member.vo.MemberVo;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl extends SqlSessionDaoSupport implements MemberDao{
	public MemberVo getLoginUserInfo(String userid) {
		return  (MemberVo)getSqlSession().selectOne("member.getLoginUserInfo",userid);
	}
}
