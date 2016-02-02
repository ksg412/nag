package com.easysport.b40.login;

import com.easysport.b40.member.vo.MemberVo;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomUserDetails implements UserDetails {

	private static final long serialVersionUID = 1L;

	private String username;
    private String password;

	private MemberVo memberVo;

	public CustomUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		this(username, password, true, true, true, true, authorities);
	}

	public CustomUserDetails(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
		if(username != null && !"".equals(username) && password != null) {
			this.username = username;
			this.password = password;
//			this.enabled = enabled;
//			this.accountNonExpired = accountNonExpired;
//			this.credentialsNonExpired = credentialsNonExpired;
//			this.accountNonLocked = accountNonLocked;
//			this.authorities = Collections.unmodifiableSet(sortAuthorities(authorities));
		} else {
			throw new IllegalArgumentException("Cannot pass null or empty values to constructor");
		}
	}

    public CustomUserDetails(String userName)
    {
    	this.username = userName;
    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();    
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        
        return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}


	public MemberVo getMemberVo() {
		return memberVo;
	}

	public void setMemberVo(MemberVo memberVo) {
		this.memberVo = memberVo;
	}
}
