package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.DeliveredOrderDAO;
import com.cg.entity.Transaction;

@Service
@Transactional
public class DeliveryproserviceImpl implements deliveryproservice {
	@Autowired
	DeliveredOrderDAO deliverDao;

	@Transactional(propagation = Propagation.REQUIRED)
	public String updateStatusAsDelivered(Integer transactionId) {
		// TODO Auto-generated method stub
		try {
		Transaction transactionObject=deliverDao.findById(transactionId).get();
		System.out.println(transactionObject);}
		catch(Exception e) {

			return "Transaction Not Found in database";
		
		}
	
		deliverDao.updateStatusAsDelivered(transactionId,"Delivered");
		return "Delivery Status Updated";
		
	}
}


