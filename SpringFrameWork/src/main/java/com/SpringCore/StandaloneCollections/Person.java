package com.SpringCore.StandaloneCollections;

import java.util.List;
import java.util.Map;

public class Person {
    private List<String> friends;
    private Map<String,String> courses;

    public Person() {
        super();
    }

    public Person(List<String> friends, Map<String, String> courses) {
        super();
        this.friends = friends;
        this.courses = courses;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", courses=" + courses +
                '}';
    }
}
