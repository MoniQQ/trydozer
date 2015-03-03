package org.moniqq.model;

import java.util.Date;

public class Orange {

    private long id;
    private Date datePicked;
    private Long price;
    private OrangeTree tree;

    public Orange() {
    }

    public Orange(long id, Date datePicked, Long price, OrangeTree tree) {
        this.id = id;
        this.datePicked = datePicked;
        this.price = price;
        this.tree = tree;
    }

    public long getId() {
        return id;
    }

    public Date getDatePicked() {
        return datePicked;
    }

    public Long getPrice() {
        return price;
    }

    public OrangeTree getTree() {
        return tree;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDatePicked(Date datePicked) {
        this.datePicked = datePicked;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public void setTree(OrangeTree tree) {
        this.tree = tree;
    }
}
