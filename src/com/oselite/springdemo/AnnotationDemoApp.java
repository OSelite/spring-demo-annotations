package com.oselite.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read the spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean
		Coach newCoach = context.getBean("footballCoach", Coach.class);
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//use beans
		System.out.println(newCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyWorkout());
		
		//close context
		context.close();
	}

}
