package com.SpringCore.StereotypeAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("student1")
public class Student {
    @Value("Anchal")
    private String studentName;
    @Value("Agra")
    private String city;
    @Value("#{list1}")
    private List<String> friends;
    public Student() {
        super();
    }



    public Student(String studentName, String city,List<String> friends) {
        super();
        this.studentName = studentName;
        this.city = city;
        this.friends = friends;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                ", friends=" + friends +
                '}';
    }
}
