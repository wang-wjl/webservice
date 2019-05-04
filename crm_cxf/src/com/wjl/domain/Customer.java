package com.wjl.domain;

/**
 * 客户实体类
 * @author Administrator
 */
public class Customer {
	private Integer id;
	private String name;
	private String station;
	private String telephone;
	private String address;
	private String decidedzone_id;
	
	public Customer()
	{}
	public Customer(Integer id, String name, String station, String telephone, String address, String decidedzone_id) {
		super();
		this.id = id;
		this.name = name;
		this.station = station;
		this.telephone = telephone;
		this.address = address;
		this.decidedzone_id = decidedzone_id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDecidedzone_id() {
		return decidedzone_id;
	}
	public void setDecidedzone_id(String decidedzone_id) {
		this.decidedzone_id = decidedzone_id;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", station=" + station + ", telephone=" + telephone
				+ ", address=" + address + ", decidedzone_id=" + decidedzone_id + "]";
	}
	
	
}
