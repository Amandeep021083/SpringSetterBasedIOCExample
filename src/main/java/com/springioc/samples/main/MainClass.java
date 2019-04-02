package com.springioc.samples.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springioc.samples.Car;
import com.springioc.samples.User;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		User user = (User)context.getBean("user");
		System.out.println(user.getName());
		
		Car car = (Car) context.getBean("car");
		System.out.println(car.getName());
		System.out.println(car.getCost());
		
		
		System.out.println(user.getName());
		System.out.println(user.getCar().getName());
		System.out.println(user.getCar().getCost());
	}

}
