package com.easysport.b40.validator;

import com.easysport.customAnnotation.annotation.Telephone;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;

/**
 * Created by sgkim on 2016-01-26.
 */
@Component
public class TelephoneValidator implements ConstraintValidator<Telephone, String> {

    private java.util.regex.Pattern pattern = java.util.regex.Pattern
            .compile("^[0-9]\\d{2}-(\\d{3}|\\d{4})-\\d{4}$");

    @Override
    public void initialize(Telephone telephone) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s == null || s.length() == 0) {
            return true;
        }
        Matcher m = pattern.matcher(s);
        return m.matches();
    }
}
