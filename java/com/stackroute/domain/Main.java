package com.stackroute.domain;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//From the constructor-injection branch of spring-xml-demo repo create a autowire-xml branch.
// For the Movie bean, delete the constructor based object injection in the bean definition file
// (beans.xml) that injects an Actor bean. Use autowire byName in the Movie bean to inject an Actor
// bean. Run the application. Create another Movie bean and try autowire byType. Run the application
// and note the exception thrown. Fix the Movie bean by removing autowire byType and using constructor
// injection instead. Push the code to autowire-xml branch.

public class Main {
  public static void main(String[] args) {


    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");


    //by Type
    Movie movie=(Movie)applicationContext.getBean("movie1");

    System.out.println(movie);

    // constructor auto -wire

    Movie movie1=(Movie)applicationContext.getBean("movie2");
    System.out.println(movie);

    // by Name

//    Movie movie3=(Movie)applicationContext.getBean("movie");
//
//    System.out.println(movie3);







  }
}
