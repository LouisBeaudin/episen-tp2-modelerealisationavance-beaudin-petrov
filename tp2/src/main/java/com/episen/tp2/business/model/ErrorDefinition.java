package com.episen.tp2.business.model;

import javax.persistence.*;
import java.util.List;

@Entity(name="errordefinition")
public class ErrorDefinition extends PersistableElement{

    @Enumerated(EnumType.STRING)
    private ErrorTypeEnum errorType;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "errordefinition", fetch = FetchType.EAGER)
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
