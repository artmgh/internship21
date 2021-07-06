package com.comarch.internship.data;

public class User {
    private String name;
    private String PESEL;

    public User(String name, String pesel) {
        this.name = name;
        PESEL = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }
}
