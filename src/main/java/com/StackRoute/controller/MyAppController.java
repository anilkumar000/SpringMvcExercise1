package com.StackRoute.controller;

import com.StackRoute.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyAppController {
  @RequestMapping("/")
  public String getGreetings(){
  return "index";
}
  @RequestMapping("/login")
  public ModelAndView getLogin(@ModelAttribute("userName") String userName)
  {
    User user=new User();
    user.setUserName(userName);
    ModelAndView modelAndView=new ModelAndView();
    modelAndView.setViewName("welcome");
    modelAndView.addObject("userName",user.getUserName());
    return modelAndView;
  }
}

