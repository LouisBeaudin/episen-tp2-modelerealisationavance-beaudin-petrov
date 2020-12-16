package com.episen.tp2.business.dto;

import com.episen.tp2.business.model.ErrorTypeEnum;

import java.util.List;

public class ErrorDefinition {

    private ErrorTypeEnum errorType;

    private List<Error> errors;

    public ErrorDefinition() {
    }

    public ErrorDefinition(ErrorTypeEnum errorType, List<Error> errors) {
        this.errorType = errorType;
        this.errors = errors;
    }

    public ErrorTypeEnum getErrorType() {
        return errorType;
    }

    public void setErrorType(ErrorTypeEnum errorType) {
        this.errorType = errorType;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }
}
