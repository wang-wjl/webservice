package com.wjl.myxml;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;
/**
 * 
 * @author wjl
 * @date 2018-09-03
 *
 */
public class Hello {
	@Test
	public void test1() throws DocumentException
	{
		//1.获取document
		SAXReader saxReader=new SAXReader();
		Document document=saxReader.read(new File("src/resources/myweb.xml"));
		
		//2.获取根元素
		Element rootElement=document.getRootElement();
		
		//打印version属性值
		String version = rootElement.attributeValue("version");
		System.out.println("version:"+version);
		
		//3.获取所有子元素
		List<Element> elements = rootElement.elements();
		
		//4.变量所有
		for (Element element : elements) {
			//5.1打印元素名
			String eleName = element.getName();
			System.out.println(eleName);
			
			//5.2处理servelt 并获得子标签的内容
			if("servlet".equals(eleName))
			{
				//方式1：获取元素对象，然后获得文本
				Element servletNameElement = element.element("servlet-name");
				String serveletName = servletNameElement.getText();
				System.out.println("servletName:"+serveletName);
				
				//方式2：获得元素文本值
				String servletClass = element.elementText("servlert-class");
				System.out.println("servletClass:"+servletClass);
			}
		}
		
		//Document读取节点 返回list
		List<Element> list = document.selectNodes("/web-app/servlet/servlet-name");
		if(list.size()>0)
		{
			Element ele = list.get(0);
			System.out.println(ele.getData());//helloServlet
			System.out.println(ele.getText());//helloServlet
		}
	}
}
