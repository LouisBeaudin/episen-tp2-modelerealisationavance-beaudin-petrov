package com.episen.tp2.business.dto;

import java.util.List;

public class DocumentList {

    private int page;
    private int nbElements;
    private List<DocumentSummary> data;

    public DocumentList() {
    }

    public DocumentList(int page, int nbElements, List<DocumentSummary> data) {
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

    public List<DocumentSummary> getData() {
        return data;
    }

    public void setData(List<DocumentSummary> data) {
        this.data = data;
    }
}
