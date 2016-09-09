package com.gadgets;

import java.util.*;

import com.model.gadget.GadgetDAO;
import com.model.gadget.Product;

public class DAOimpl implements GadgetDAO {
	
	  //list is working as a database
	   List<Product> products;

	   public DAOimpl(){
		   products = new ArrayList<Product>();
	      Product product1 = new Product(1, "Robert");
	      Product product2 = new Product(2, "Robert");
	      products.add(product1);
	      products.add(product2);		
	   }
	   public void deleteProduct(Product product) {
		   products.remove(product.getId());
	      System.out.println("Product: Id " + product.getId() + ", deleted from database");
	   }

	   //retrive list of products from the database//
	   public List<Product> getAllProducts() {
	      return products;
	   }

	   public Product getProduct(int Id) {
	      return products.get(Id);
	   }

	   public void updateProduct(Product product) {
		   products.get(product.getId()).setName(product.getName());
	      System.out.println("Product: Id " + product.getId() + ", updated in the database");
	   }	   
}  