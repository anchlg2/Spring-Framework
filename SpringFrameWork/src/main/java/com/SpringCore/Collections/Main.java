package com.SpringCore.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("CollectionsConfig.xml");
        Emp e1=(Emp) context.getBean("Emp1");
        System.out.println(e1);
    }
}
