package com.example.demo.ciambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Addition bean = (Addition) context.getBean("add");
		bean.doSum();
		context.registerShutdownHook();
	}

}
