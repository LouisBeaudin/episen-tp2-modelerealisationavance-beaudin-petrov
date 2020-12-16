package com.episen.tp2.business.dto;


public class PageData {
    private int page;
    private int nbElements;

    public PageData() {
    }

    public PageData(int page, int nbElements) {
        this.page = page;
        this.nbElements = nbElements;
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
}
