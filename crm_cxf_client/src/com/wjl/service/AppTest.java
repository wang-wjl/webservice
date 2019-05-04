package com.wjl.service;

import java.util.List;

import org.junit.Test;

public class AppTest {
	@Test
	public void test1()
	{
		CustomerServiceService css = new CustomerServiceService();
		ICutomerService proxy = css.getCustomerServicePort();
		List<Customer> list = proxy.findAll();
		for (Customer customer : list) {
			System.out.println(customer);
		}
	}
}
