package com.easysport.b40.validator;

import com.easysport.b40.userInfo.service.UserInfoService;
import com.easysport.b40.userInfo.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by sgkim on 2016-01-23.
 */
@Component
public class PasswordCheckValidator implements Validator {

    @Autowired
    private UserInfoService userInfoService;

    @Override
    public boolean supports(Class<?> aClass) {
        return UserInfoVo.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        UserInfoVo userInfoVo = (UserInfoVo)o;
        if(!userInfoVo.getPassword().equals(userInfoVo.getPasswordCheck())){
            errors.rejectValue("passwordCheck","validator.passwordCheck.error");
        }
    }
}
