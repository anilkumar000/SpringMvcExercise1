package com.StackRoute.controller;

import com.StackRoute.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
//makes a class as Controller

public class MyAppController {
  //  Homepage Mapping
  @RequestMapping("/")
  public String getGreetings(){
  return "index";
}

//Maps the process of login page with the below method
  @RequestMapping("/login")
  public ModelAndView getLogin(@ModelAttribute("userName") String userName)
  {
    User user=new User();
    user.setUserName(userName);

    // Creation of ModelAndView to set Viewname,and any objects needed to that view
    ModelAndView modelAndView=new ModelAndView();
    modelAndView.setViewName("welcome");
    modelAndView.addObject("userName",user.getUserName());
    return modelAndView;
  }
}

