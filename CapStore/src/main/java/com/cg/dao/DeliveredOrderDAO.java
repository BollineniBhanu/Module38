package com.cg.dao;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entity.Transaction;
@Repository
public interface DeliveredOrderDAO extends JpaRepository<Transaction,Integer> {
	@Transactional
	  @Modifying
	@Query("update Transaction t set t.status=?2 where t.transactionId=?1")
	public void updateStatusAsDelivered(Integer transactionId,String status);
}
