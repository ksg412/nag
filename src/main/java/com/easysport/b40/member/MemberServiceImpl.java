package com.easysport.b40.member;

import com.easysport.b40.login.CustomUserDetails;
import com.easysport.b40.member.vo.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class MemberServiceImpl implements UserDetailsService  {

	@Autowired
	private MemberDao memberDao;
	
	public void setMemberDao(MemberDao memeberDao) {
		this.memberDao = memeberDao;
	}

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {

		MemberVo memberVo = memberDao.getLoginUserInfo(username);

		Collection<SimpleGrantedAuthority> roles = new ArrayList<SimpleGrantedAuthority>();
		roles.add(new SimpleGrantedAuthority("ROLE_USER"));

		CustomUserDetails user = new CustomUserDetails(memberVo.getName(), memberVo.getPassword(), roles);
		user.setMemberVo(memberVo);
		return user;
	}
}
