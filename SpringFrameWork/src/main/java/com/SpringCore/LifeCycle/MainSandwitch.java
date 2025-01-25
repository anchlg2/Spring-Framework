package com.SpringCore.LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSandwitch {
    public static void main(String[] args) {
        AbstractApplicationContext context =new ClassPathXmlApplicationContext("SandwitchConfig.xml");
       Sandwitch s1= (Sandwitch) context.getBean("sandwitch1");
        System.out.println(s1);
        context.registerShutdownHook(); //it is responsible to run destroy method
    }
}
