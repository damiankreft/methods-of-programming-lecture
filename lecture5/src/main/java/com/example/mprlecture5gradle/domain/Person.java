package com.example.mprlecture5gradle.domain;

public class Person {
    private String id;
    private String firstName;
    private int yob; // year of birth

    public Person(String firstName, int yob) {
        this.firstName = firstName;
        this.yob = yob;
    }

    public Person(String id, String firstName, int yob) {
        this.id = id;
        this.firstName = firstName;
        this.yob = yob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }
}
