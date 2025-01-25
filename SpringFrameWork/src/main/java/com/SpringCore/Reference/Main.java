package com.SpringCore.Reference;

import com.SpringCore.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
ApplicationContext context =new ClassPathXmlApplicationContext("RefConfig.xml");
       // B b1=(B)context.getBean("b1");
A a1=(A)context.getBean("a1");

        A a2=(A)context.getBean("a2");
        System.out.println(a1);
        System.out.println(a1.getX());
        System.out.println(a1.getObj().getY());
        System.out.println(a2);
    }
}
