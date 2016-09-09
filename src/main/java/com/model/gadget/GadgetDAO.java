package com.model.gadget;

import java.util.List;

public interface GadgetDAO {
	   public List<Product> getAllProducts();
	   public Product getProduct(int Id);
	public void deleteProduct(Product product);
	public void updateProduct(Product product);
	

	}
