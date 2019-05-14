package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//From the master branch of spring-xml-demo repo create a constructor-injection branch.
// Add constructor to the Actor class to initialize with name and gender, and ageCreate
// three beans of type Actor in the bean definition file.  Use constructor-based
// injection in the bean definition file (beans.xml) to inject property values in each
// of the three beans via name, index, and type respectively. For the Movie bean, use
// constructor based object injection in the bean definition file (beans.xml) to inject
// an Actor bean. In the Main class, look up Movie bean using ApplicationContext and
// print out Author information. Use the same ApplicationContext to again look up the
// same Movie bean. Print out the equality result of the two Movie beans.
// System.out.println(beanA==beanB); Change the scope of the Movie bean in beans.xml
// to prototype and run the application again. Note the output. Replace id of the Movie
// bean with name having two values, like this: <bean name=”MovieA, MovieB” ........>
// Update the code in Main to get the Movie bean by its two different name. Push the
// code to constructor-injection branch.
public class Main {
  public static void main(String[] args) {
//fetching beans from beanfactory
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

    //movie objects
    Movie movie1 = (Movie) applicationContext.getBean("actor1");
    Movie movie2 = (Movie) applicationContext.getBean("actor2");
    Movie movie3 = (Movie) applicationContext.getBean("actor3");
    System.out.println(movie1);
    System.out.println(movie2);
    System.out.println(movie3);
// calling movie class
    Movie movie4 = (Movie) applicationContext.getBean("actor1");
    Movie movie5 = (Movie) applicationContext.getBean("actor1");
//checking if(beanA==beanB) with prototype scope
    System.out.println(movie4 == movie5);


    Movie movie6 = (Movie) applicationContext.getBean("actor2");
    Movie movie7 = (Movie) applicationContext.getBean("actor2");
////checking if(beanA==beanB) with singleton scope
    System.out.println(movie6 == movie7);
  }
}
