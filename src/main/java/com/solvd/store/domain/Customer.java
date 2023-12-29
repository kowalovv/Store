package com.solvd.store.domain;

public class Customer {

    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String mail;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
