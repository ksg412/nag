package com.easysport.customAnnotation.annotation;

import com.easysport.b40.validator.EmailOverlabCheckValidator;

import javax.validation.Constraint;
import java.lang.annotation.*;

/**
 * Created by sgkim on 2016-01-28.
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy={EmailOverlabCheckValidator.class})
public @interface EmailOverlabCheck {

    String message() default "{validator.email.overlab}";
    Class<?>[] groups() default {};
    Class<?>[] payload() default {};
}
