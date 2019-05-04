package com.wjl.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;

import com.wjl.domain.Customer;

@Transactional
public class CustomerService implements ICutomerService{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public List<Customer> findAll() {
		String sql="select *from t_customer";
		List<Customer> list = jdbcTemplate.query(sql, new RowMapper<Customer>() {

			public Customer mapRow(ResultSet rs, int arg1) throws SQLException {
				int id = rs.getInt("id");//根据字段名称从结果集获取
				String name = rs.getString("name");
				String station = rs.getString("station");
				String telephone = rs.getString("telephone");
				String address = rs.getString("address");
				String decidedzone_id = rs.getString("decidedzone_id");
				return new Customer(id, name, station, telephone, address, decidedzone_id);
			}
		});
		return list;
	}
	
	

}
