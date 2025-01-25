package com.SpringCore.StereotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
ApplicationContext context =new ClassPathXmlApplicationContext("StereoConfig.xml");


     // Student s1= context.getBean(Student.class);
        // Student s1= (Student) context.getBean("student"); by default
        Student s1= context.getBean("student1",Student.class);
        System.out.println(s1);
    }
}
