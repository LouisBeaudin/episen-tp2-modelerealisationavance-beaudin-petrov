package com.episen.tp2.business.dto;

import java.sql.Timestamp;

public class DocumentSummary {
    private Long documentId;
    private String description;
    private Timestamp created;
    private Timestamp updated;
    private String title;

    public DocumentSummary() {
    }

    public DocumentSummary(Long documentId, String description, Timestamp created, Timestamp updated, String title) {
        this.documentId = documentId;
        this.description = description;
        this.created = created;
        this.updated = updated;
        this.title = title;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
