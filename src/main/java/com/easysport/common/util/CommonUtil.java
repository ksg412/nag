package com.easysport.common.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.easysport.b40.login.CustomUserDetails;
import com.easysport.b40.member.vo.MemberVo;

/**
 * Created by sgkim on 2016-01-27.
 */
@Component
public class CommonUtil {

    public boolean getCurrentLoginCheck(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication.getPrincipal() instanceof CustomUserDetails){
            return true;
        }else{
            return false;
        }
    }

    public String getUserEmail(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUserDetails user = (CustomUserDetails) authentication.getPrincipal();
        return user.getMemberVo().getEmail();
    }

    public String getUserName(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUserDetails user = (CustomUserDetails) authentication.getPrincipal();
        return user.getMemberVo().getName();
    }

    public String getUserPhoneNumber(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUserDetails user = (CustomUserDetails) authentication.getPrincipal();
        return user.getMemberVo().getPhoneNumber();
    }

    public MemberVo getMemberVo(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUserDetails user = (CustomUserDetails) authentication.getPrincipal();
        return user.getMemberVo();
    }
}
