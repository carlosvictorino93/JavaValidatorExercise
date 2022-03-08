package com.aula04.banco.banco.utils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CNPJValidador implements ConstraintValidator<CNPJ, String> {
    @Override
    public void initialize(CNPJ constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String cnpj, ConstraintValidatorContext context) {
        String cnpjDigitos = cnpj.replaceAll("\\D", "");

        if(cnpjDigitos == null ||
                cnpjDigitos.length() != 14 ||
                cnpjDigitos.equals("99999999999999") ||
                cnpjDigitos.equals("55555555555555")){return  false;}
        return true;
    }
}
