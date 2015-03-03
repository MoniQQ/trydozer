package org.moniqq.model;

public class OrangeTree {

    private long id;
    private String name;

    public OrangeTree() {
    }

    public OrangeTree(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
