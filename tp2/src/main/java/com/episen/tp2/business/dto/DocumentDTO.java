package com.episen.tp2.business.dto;

import com.episen.tp2.business.model.DocumentStatusEnum;

import java.sql.Timestamp;

public class DocumentDTO {

    private Long documentId;
    private String description;
    private Timestamp created;
    private Timestamp updated;
    private String title;
    private String creator;
    private String editor;
    private String body;
    private DocumentStatusEnum statusdocument;

    public DocumentDTO() {
    }

    public DocumentDTO(Long documentId, String description, Timestamp created, Timestamp updated, String title, String creator, String editor, String body, DocumentStatusEnum statusdocument) {
        this.documentId = documentId;
        this.description = description;
        this.created = created;
        this.updated = updated;
        this.title = title;
        this.creator = creator;
        this.editor = editor;
        this.body = body;
        this.statusdocument = statusdocument;
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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public DocumentStatusEnum getStatusdocument() {
        return statusdocument;
    }

    public void setStatusdocument(DocumentStatusEnum statusdocument) {
        this.statusdocument = statusdocument;
    }
}
