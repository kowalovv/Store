package com.solvd.store.persistence.Connection;

class Config {

    private String url = "jdbc:mysql://127.0.0.1:3306/Store";
    private String user = "root";
    private String passwd = "1003";

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPasswd() {
        return passwd;
    }
}
