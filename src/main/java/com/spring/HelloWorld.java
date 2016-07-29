package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	
	@Autowired
	private H h;
	
    private String name;
    public void setName(String name){
    	this.name=name;
    }
    public void printHello(){
    	System.out.println("HelloWorld print hello started");
    	h.printH();
    	System.out.println("hello world to Spring+Maven Mr." +name);
    	System.out.println("HelloWorld print hello ended");
    }
}
