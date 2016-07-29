package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mian {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.printHello();
		/*BeanFactory factory = new XmlBeanFactory(new ClassPathResource("Spring-Module.xml"));
		HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
	     obj.printHello();*/
	}
}
