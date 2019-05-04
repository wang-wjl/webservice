package com.wjl.webservice;

/**
 * 1.使用wsimport命令解析wsdl文件生成本地代码 
 * 2.通过本地代码创建一个代理对象
 * @author Administrator
 *
 */
public class App {
	public static void main(String[] args) {
		HelloServiceService helloService = new HelloServiceService();
		HelloService proxy = helloService.getHelloServicePort();
		String sayHello = proxy.sayHello("Lucy");
		System.out.println(sayHello);
	}
}
