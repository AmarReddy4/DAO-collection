package com.gadgets;

import com.model.gadget.GadgetDAO;
import com.model.gadget.Product;

public class Pattern {
   
	public static void main(String[] args) 
	{
      GadgetDAO gadgetDAO = new DAOimpl();

      //print all products
      for (Product product : gadgetDAO.getAllProducts()) {
         System.out.println("Product: [Id : " + product.getId() + ", Name : " + product.getName() + " ]");
      }


      //update product
      Product product = gadgetDAO.getAllProducts().get(0);
      product.setName("wer");
      gadgetDAO.updateProduct(product);

      //get the product
      gadgetDAO.getProduct(0);
      System.out.println("Product: [Id : " + product.getId() + ", Name : " + product.getName() + " ]");		
   }
}