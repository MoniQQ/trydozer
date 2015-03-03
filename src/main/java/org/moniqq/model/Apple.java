package org.moniqq.model;

import org.joda.time.DateTime;

public class Apple {

    private Long id;
    private String name;
    private DateTime datePicked;

    public Apple() {
    }

    public Apple(Long id, String name, DateTime datePicked) {
        this.id = id;
        this.name = name;
        this.datePicked = datePicked;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public DateTime getDatePicked() {
        return datePicked;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDatePicked(DateTime datePicked) {
        this.datePicked = datePicked;
    }
}
