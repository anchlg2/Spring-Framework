package com.SpringCore.StandaloneCollections;

import com.SpringCore.LifeCycle.Samosa;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context =new ClassPathXmlApplicationContext("StandaloneConfig.xml");
  Person p1= (Person) context.getBean("person1");
        System.out.println(p1);

    }
}
