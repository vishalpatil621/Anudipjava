package com.springorm.Labtest15.Dao;

import java.util.List;

import com.springorm.Labtest15.Entities.Product;

public interface ProductDao {

	public int insertProduct(Product pro);

	public int updateProduct(Product pro);

	public int deleteProduct(Product pro);

	public Product getProduct(int id);

	public List<Product> getAllProducts();
}
