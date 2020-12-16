package com.episen.tp2.business.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity(name="error")
public class Error extends PersistableElement{

    @Column(name="errorCode")
    private String errorCode;

    @Column(name="errorMessage")
    private String errorMessage;

    @ManyToOne(cascade = CascadeType.ALL)
    private ErrorDefinition errordefinition;

    public Error() {
    }

    public Error(String errorCode, String errorMessage, ErrorDefinition errordefinition) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errordefinition = errordefinition;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ErrorDefinition getErrordefinition() {
        return errordefinition;
    }

    public void setErrordefinition(ErrorDefinition errordefinition) {
        this.errordefinition = errordefinition;
    }
}
