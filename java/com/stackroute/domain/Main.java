package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
  public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

    Movie movie = (Movie) applicationContext.getBean("movie");
    System.out.println(movie);

    Movie movie1 = (Movie) applicationContext.getBean("movie1");
    System.out.println(movie1);
  }


}
