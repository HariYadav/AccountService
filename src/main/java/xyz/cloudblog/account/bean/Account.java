package xyz.cloudblog.account.bean;

public class Account {

	private Long accountID;
	private Double balance;

	public Account() {	}
	
	public Account(Long acountID, Double balance){
		this.accountID = acountID;
		this.balance = balance;
	}
	public Long getAccountID() {
		return accountID;
	}

	public void setAccountID(Long accountID) {
		this.accountID = accountID;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

}
