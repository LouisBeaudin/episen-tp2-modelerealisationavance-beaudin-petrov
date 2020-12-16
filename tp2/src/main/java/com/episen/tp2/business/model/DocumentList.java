package com.episen.tp2.business.model;


import javax.persistence.*;
import java.util.List;

@Entity(name="documentlist")
public class DocumentList extends PersistableElement{

    @Column(name="page")
    private int page;

    @Column(name="nbElements")
    private int nbElements;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "documentlist", fetch = FetchType.EAGER)
    private List<Document> data;

    public DocumentList() {
    }

    public DocumentList(int page, int nbElements, List<Document> data) {
        this.page = page;
        this.nbElements = nbElements;
        this.data = data;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getNbElements() {
        return nbElements;
    }

    public void setNbElements(int nbElements) {
        this.nbElements = nbElements;
    }

    public List<Document> getData() {
        return data;
    }

    public void setData(List<Document> data) {
        this.data = data;
    }
}
