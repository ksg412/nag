package com.easysport.b40.login;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;

public class CustomAuthenticationProvider implements AuthenticationProvider {

	private static final Logger logger = LoggerFactory.getLogger(loginController.class);
	
	@Override
	public Authentication authenticate(Authentication authentication)
			throws AuthenticationException {
		String user_id = (String)authentication.getPrincipal();
		List<GrantedAuthority> roles = (List<GrantedAuthority>) authentication.getAuthorities();
		String user_pw = "secret";/*(String)authentication.getCredentials();*/
		
		logger.info("Welcome authenticate! {}", user_id);
		
		// check whether user's credentials are valid.
		// if false, throw new BadCredentialsException(messages.getMessage("AbstractUserDetailsAuthenticationProvider.badCredentials", "Bad credentials"));
		
//		List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
//		roles.add(new SimpleGrantedAuthority("ROLE_USER"));

		UsernamePasswordAuthenticationToken result = new UsernamePasswordAuthenticationToken(user_id, user_pw, roles);
		result.setDetails(new CustomUserDetails(user_id));
		return result;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
