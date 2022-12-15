package com.springorm.Labtest15.DaoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.Labtest15.Dao.ProductDao;
import com.springorm.Labtest15.Entities.Product;

public class ProductDaoImpl implements ProductDao{
	
	private HibernateTemplate ht;

	// To insert record of Product
	@Override
	@Transactional
		public int insertProduct(Product pro) {
			int id = (int) ht.save(pro);
			return 1;
	}
	
	// To update record of Product
	@Override
	@Transactional
	public int updateProduct(Product pro) {
		ht.update(pro);
		return 1;
	}

	// To delete record of Product
	@Override
	@Transactional
	public int deleteProduct(Product pro) {
		ht.delete(pro);
		return 1;

	}

	// To get record of Product
	@Override
	public Product getProduct(int id) {
		Product dept = ht.get(Product.class, id);
		return dept;

	}

	// To Get All record of Product
	@Override
	public List<Product> getAllProducts() {
		List<Product> deptList = ht.loadAll(Product.class);
		return deptList;

	}
	
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

}
