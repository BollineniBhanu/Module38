package com.cg.service;

import java.util.List;

import com.cg.entity.Transaction;
import com.cg.entity.User1;



public interface deliveryproservice {
//	public Product findById(Integer[] pid);
//	public boolean updateInventory(Cart cart, String modeOfPurchase);
//	public boolean updateProduct(Product product, Integer[] quantity);
//
//	//public String  status(Integer TransactionId, String status) ;
//		
//	// public String undelivered(Integer TransactionId, String status);
//	
	
	
	public String updateStatusAsDelivered(Integer transactionId);
}
