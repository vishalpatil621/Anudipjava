package com.springorm.Labtest15.DaoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.Labtest15.Dao.CustomerDao;
import com.springorm.Labtest15.Entities.Customer;

public class CostomerDaoImpl implements CustomerDao {

	private HibernateTemplate ht;

	@Override
	@Transactional
	public int insertCustomer(Customer cst) {
		int i = (Integer) ht.save(cst);
		return i;
	}

	@Override
	@Transactional
	public int updateCustomer(int id, String cname) {
		Customer c = ht.get(Customer.class, id);
		c.setCname(cname);
		ht.update(c);
		return 1;
	}

	@Override
	@Transactional
	public int deleteCustomer(Customer cst) {
	  ht.delete(cst);	
	  return 1;

	}

	@Override
	public Customer getCustomer(int id) {
		
		return ht.get(Customer.class, id);
	}

	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> clist=ht.loadAll(Customer.class);
		return clist;
	}
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

}
