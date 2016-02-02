package com.easysport.customAnnotation.annotation;

import com.easysport.b40.validator.TelephoneValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Size;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by sgkim on 2016-01-26.
 */
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TelephoneValidator.class)
@Size(min = 12, max = 13)
public @interface Telephone {

    String message() default "{validator.required.input}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
