package com.spring.dynamic.web.model;

import java.io.Serializable;

public class Hotel implements Serializable {

    private String name;

    public Hotel() {
    }

    public Hotel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
