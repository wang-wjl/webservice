package com.wjl.webservice;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
/**
 * wsimpost 命令的使用
 * 解析wsdl文件 生成客户端代码
 * @author Administrator
 *
 */
@WebService
public class HelloService {
	public String sayHello(String name)
	{
		System.out.println("服务端sayHello方法被调用");
		return "hello:"+name;
	}
	
	/**
	 * http://localhost:8080/hello?wsdl 服务说明书地址
	 * @param args
	 */
	public static void main(String[] args) {
		String address="http://localhost:8080/hello";
		Object implementor=new HelloService();
		//发布服务
		Endpoint.publish(address, implementor);
	}
}
