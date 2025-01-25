package com.SpringCore.Autowire;

import com.SpringCore.Constructor.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("AutowireConfig.xml");
//Emp e1= (Emp) context.getBean("emp1");
//        System.out.println(e1);
//        Emp e2=(Emp)context.getBean("emp2");
//        System.out.println(e2);
        Emp e3=(Emp)context.getBean("emp3");
        System.out.println(e3);

    }
}
