package com.StackRoute.config;

import com.StackRoute.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan(basePackages = "com.StackRoute")
//Scans components required from given package address

@EnableWebMvc
//it imports Spring web mvc config from WebmvcConfig.Support

@Configuration
//makes our class as Configuration class

public class MyAppConfigurationClass {

  @Bean
  //  creates a bean
  public ViewResolver viewResolver() {
    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//    It is a internal class in which it addes some prefix and suffix to view name from Controller,
//    Searches for the object and returns view object

    viewResolver.setPrefix("/WEB-INF/views/");
    viewResolver.setSuffix(".jsp");

    return viewResolver;
  }


}
