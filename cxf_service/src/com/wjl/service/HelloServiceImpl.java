package com.wjl.service;
/**
 * wsdl文档   http://localhost:8066/cxf_service/service/cxfService?wsdl
 * @author Administrator
 *
 */
public class HelloServiceImpl implements HelloService {
	public static int num=1; 
	public String sayHello(String name) {
		System.out.println("第"+num+"调用");
		num++;
		System.out.println("基于CXF开发的服务端调用服务器sayHello方法");
		
		return "hello:"+name;
	}

}
