package com.easysport.customAnnotation.annotation;

import com.easysport.b40.validator.ExistCheckValidator;

import javax.validation.Constraint;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy={ExistCheckValidator.class})
public @interface ExistCheck {

    String message() default "{validator.required.input}";
    Class<?>[] groups() default {};
    Class<?>[] payload() default {};

    String tableName() default "";
    String columnName() default "";
    String fieldName() default "";

}