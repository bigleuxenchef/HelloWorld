package com.tutorialspoint;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
	   AbstractApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");
     
      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

      objA.setMessage("I'm object A");
      objA.getMessage();

      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
      objB.getMessage();
      
      objA.getMessage();

      
      HelloWorld objC = (HelloWorld) context.getBean("helloWorld2");
      objC.getMessage();
      
      context.registerShutdownHook();

      
   }
}
