package com.easysport.b40.validator;

import com.easysport.customAnnotation.annotation.ExistCheck;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by sgkim on 2016-01-26.
 */
public class ExistCheckValidator implements ConstraintValidator<ExistCheck, Object> {


    String tableName;
    String columnName;


    @Override
    public void initialize(ExistCheck existCheck) {
        this.tableName = existCheck.tableName();
        this.columnName = existCheck.columnName();
    }

    @Override
    public boolean isValid(Object object, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
