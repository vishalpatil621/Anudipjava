package com.springorm.Labtest15.Dao;

import java.util.List;

import com.springorm.Labtest15.Entities.Customer;


public interface CustomerDao {
	
	public int insertCustomer(Customer cst);

	public int updateCustomer(int id, String cname);

	public int deleteCustomer(Customer cst);

	public Customer getCustomer(int id);

	public List<Customer> getAllCustomer();

}
