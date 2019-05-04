package com.wjl.service;

import org.junit.Test;

public class AppTest {
	@Test
	public void test1()
	{
		HelloServiceImplService ss = new HelloServiceImplService();
		HelloService proxy = ss.getHelloServiceImplPort();
		for(int i=0;i<1000;i++)
		{
			String str = proxy.sayHello("Lucy");
			System.out.println(str);
		}
	}
}
