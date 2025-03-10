package com.SpringJDBC;

public class Student {
    private int Id;
    private String name;
    private String city;

    public Student() {
        super();
    }

    public Student(int id, String name, String city) {
        super();
        Id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
