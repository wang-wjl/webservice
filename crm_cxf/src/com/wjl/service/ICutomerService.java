package com.wjl.service;

import java.util.List;

import javax.jws.WebService;

import com.wjl.domain.Customer;
@WebService
public interface ICutomerService {
	public List<Customer> findAll();
}
