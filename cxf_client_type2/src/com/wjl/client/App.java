package com.wjl.client;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	@Test
	public void test()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("cxf.xml");
		HelloService proxy = (HelloService)context.getBean("myClient");
		String info = proxy.sayHello("test");
		System.out.println(info);
	}
}
