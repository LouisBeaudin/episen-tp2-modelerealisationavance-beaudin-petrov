package com.episen.tp2.business.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity(name="document")
public class Document implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long documentid;

    @Column (name="created")
    private Timestamp created;

    @Column(name="updated")
    private Timestamp updated;

    @Column(name="title")
    private String title;

    @Column(name="creator")
    private String creator;

    @Column(name="editor")
    private String editor;

    @Column(name="body")
    private String body;

    @Enumerated(EnumType.STRING)
    private DocumentStatusEnum statusdocument;

    @ManyToOne(cascade = CascadeType.ALL)
    private DocumentList documentlist;

    public Document() {
    }

    public Document(Long documentid, Timestamp created, Timestamp updated, String title, String creator, String editor, String body, DocumentStatusEnum statusdocument, DocumentList documentlist) {
        this.documentid = documentid;
        this.created = created;
        this.updated = updated;
        this.title = title;
        this.creator = creator;
        this.editor = editor;
        this.body = body;
        this.statusdocument = statusdocument;
        this.documentlist = documentlist;
    }

    public Long getDocumentid() {
        return documentid;
    }

    public void setDocumentid(Long documentid) {
        this.documentid = documentid;
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

    public DocumentList getDocumentlist() {
        return documentlist;
    }

    public void setDocumentlist(DocumentList documentlist) {
        this.documentlist = documentlist;
    }
}
