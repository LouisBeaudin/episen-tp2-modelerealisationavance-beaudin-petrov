package com.episen.tp2.business.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

@Entity(name="lock")
public class Lock extends PersistableElement{

    @Column(name="owner")
    private String owner;

    @Column (name="created")
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
