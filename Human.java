package com.kronos.test;

public class Human {
	
      String name;
      int age;
      int heightInInches;
      String eyeColor;
      
      public Human()
      {
    	  
      }
      
      public void speak()
      {
    	  System.out.println("My name is " +name);
    	  System.out.println("My age is " +age);
    	  System.out.println("I am " + heightInInches + " tall");
    	  System.out.println("My eye colour is " + eyeColor);
    	  
      }
      
      public void eat()
      {
    	  System.out.println("I am eating");
      }
      
      public void sleep()
      {
    	  System.out.println("I am sleeping");
      }
}
