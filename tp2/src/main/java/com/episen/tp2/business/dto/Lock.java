package com.episen.tp2.business.dto;

import java.sql.Timestamp;

public class Lock {

    private String owner;
    private Timestamp created;

    public Lock() {
    }

    public Lock(String owner, Timestamp created) {
        this.owner = owner;
        this.created = created;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }
}
