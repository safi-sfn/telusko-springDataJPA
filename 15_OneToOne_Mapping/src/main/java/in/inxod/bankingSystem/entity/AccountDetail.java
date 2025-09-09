package in.inxod.bankingSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="account_detail")
public class AccountDetail {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String accountNumber;
	    private Double balance;
	    private String ifscCode;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		public Double getBalance() {
			return balance;
		}
		public void setBalance(Double balance) {
			this.balance = balance;
		}
		public String getIfscCode() {
			return ifscCode;
		}
		public void setIfscCode(String ifscCode) {
			this.ifscCode = ifscCode;
		}
		public AccountDetail(String accountNumber, Double balance, String ifscCode) {
			super();
			this.accountNumber = accountNumber;
			this.balance = balance;
			this.ifscCode = ifscCode;
		}
		public AccountDetail() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
}
