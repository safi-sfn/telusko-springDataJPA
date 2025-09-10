package in.inxod.bankingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.inxod.bankingSystem.entity.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {

	
}
