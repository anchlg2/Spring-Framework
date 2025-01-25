package com.SpringCore.Constructor;

public class Person {
    private String name;
    private String personId;
private Certi certi;

    public Person() {
        super();
    }

    public Person(String name, String personId, Certi certi) {
        super();
        this.name = name;
        this.personId = personId;
        this.certi = certi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public Certi getCerti() {
        return certi;
    }

    public void setCerti(Certi certi) {
        this.certi = certi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId='" + personId + '\'' +
                ", certi=" + certi +
                '}';
    }
}
