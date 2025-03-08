package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.util.ArrayList;
import java.util.List;

//step 3 : create controller class
@Controller

public class HomeController {  //controller is the end point of project through which client(postman) interact with java code
//    @RequestMapping("/home")
//    public String home() //handler method
//    {//this handler method body will execute when /home url will hit
//        System.out.println("this is home url"); //in console logs
//        return "index"; // returns view name
//    }
    @RequestMapping("/about")
    public String about()
    {
        System.out.println("this is about url");
        return "about";
    }
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(Model model) //handler method
    {//this handler method body will execute when /home url will hit
        System.out.println("this is home url"); //in console logs
model.addAttribute("name" , "Anchal");
model.addAttribute("id",1234);
        List<String> friends=new ArrayList<>();
        friends.add("Anchal");
        friends.add("Tia");
        friends.add("Tara");
        friends.add("Ayush");
        model.addAttribute("list" ,friends);
        return "index"; // returns view name
    }
    @RequestMapping("/help")
    public ModelAndView help()
    { System.out.println("This is help url");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("name","Tamanna");
        modelAndView.addObject("rollNumber",123456);
        modelAndView.setViewName("help");
        return modelAndView;
    }
}
