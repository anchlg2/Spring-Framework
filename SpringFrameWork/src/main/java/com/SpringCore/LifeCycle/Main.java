package com.SpringCore.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context =new ClassPathXmlApplicationContext("SamosaConfig.xml");
  Samosa s1= (Samosa) context.getBean("samosa1");
        System.out.println(s1);
        context.registerShutdownHook();
    }
}
