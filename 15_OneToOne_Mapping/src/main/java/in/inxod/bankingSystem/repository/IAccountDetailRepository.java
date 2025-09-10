package in.inxod.bankingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.inxod.bankingSystem.entity.AccountDetail;
import in.inxod.bankingSystem.entity.Customer;

@Repository
public interface IAccountDetailRepository extends JpaRepository<AccountDetail, Long> {
 
	// custom finder with JPQL
	//"Mujhe wo Customer do (c) jo apne AccountDetail (a) ke accountNumber = :accNum ke equal ho."
	
	@Query("SELECT c FROM Customer c JOIN c.accountDetail a WHERE a.accountNumber = :accNum")
	Customer findByAccountNumber(@Param("accNum")String accountNumber);
}
