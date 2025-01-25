package com.SpringCore.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPepsi {
    public static void main(String[] args) {
        AbstractApplicationContext context =new ClassPathXmlApplicationContext("PepsiCOnfig.xml");
       Pepsi p1= (Pepsi) context.getBean("pepsi1");
        System.out.println(p1);
        context.registerShutdownHook(); //it is responsible to run destroy method
    }
}
