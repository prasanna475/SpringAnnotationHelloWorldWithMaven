package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FirstClass {

	@Autowired
	private SecondClass secondClass;

	public void printHello() {
		System.out.println("HelloWorld print hello started");
		secondClass.print();
		System.out.println("HelloWorld print hello ended");
	}
}
