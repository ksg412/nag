package com.easysport.b40.validator;

import com.easysport.b40.userInfo.service.UserInfoService;
import com.easysport.common.util.CommonUtil;
import com.easysport.customAnnotation.annotation.EmailOverlabCheck;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by sgkim on 2016-01-28.
 */
public class EmailOverlabCheckValidator implements ConstraintValidator<EmailOverlabCheck, Object> {

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private CommonUtil commonUtil;

    @Override
    public void initialize(EmailOverlabCheck emailOverlabCheck) {

    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext){
        String email = (String) o;

        if(!commonUtil.getCurrentLoginCheck()){
            try {
                if(userInfoService.selectEmailOverlabCheck(email)>0){
                    return false;
                }
            } catch (Exception e) {
                return false;
            }
        }

        return true;
    }
}
