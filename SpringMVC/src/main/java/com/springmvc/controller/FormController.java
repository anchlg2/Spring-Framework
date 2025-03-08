package com.springmvc.controller;

import com.springmvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    @RequestMapping(value = "/form" ,method = RequestMethod.GET)
    public String showForm()
    {
        System.out.println("This is form url");
        return "form"; //view name
    }
    //method 1
//    @RequestMapping(value = "/processForm" ,method = RequestMethod.POST)
//    public String saveFormDetails(@RequestParam("email") String email , @RequestParam("name") String userName , @RequestParam("password") String password , Model model)
//    {
//
//       model.addAttribute("mail",email);
//       model.addAttribute("name",userName);
//       model.addAttribute("password",password);
//
//        return "success";
//    }
    //method 2
//    @RequestMapping(value = "/processForm" ,method = RequestMethod.POST)
//    public String saveFormDetails(@RequestParam("email") String email , @RequestParam("name") String name , @RequestParam("password") String password , Model model)
//    { //@RequestParam is used in spring mvc, here jo form se data aata hai wo email variable me daala jata h , just opposite of @Param
//        User user=new User();
//        user.setEmail(email);
//        user.setName(name);
//        user.setPassword(password);
//        model.addAttribute("userDetails",user);
//        return "success";
//    }
    //method 3
//    @RequestMapping(value = "/processForm" ,method = RequestMethod.POST)
//    public String saveFormDetails(@ModelAttribute User user, Model model)
//    {
//
//        System.out.println("This is success url");
//       model.addAttribute("User",user);
//        return "success";
//
//
//    }
    //method 4
    @RequestMapping(value = "/processForm" ,method = RequestMethod.POST)
    public String saveFormDetails(@ModelAttribute User user, Model model)
    {

        System.out.println("This is success url");

        return "success";


    }
}
