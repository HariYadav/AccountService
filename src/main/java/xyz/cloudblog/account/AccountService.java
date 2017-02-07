package xyz.cloudblog.account;

import xyz.cloudblog.account.bean.Account;

/**
 * This service interface supports various operations related to Bank Account 
 * @author hari.yadav
 *
 */
public interface AccountService {

	/**
	 * Provides account balance for given {@code Account}/accountID
	 * @param account under transaction 
	 * @return available balance
	 */
	public double checkBalance(Account account);
	
	
	/**
	 * Supports deposit to specific {@code Account}
	 * @param account under transaction
	 * @param amount to be deposited
	 * @return new account balance
	 */
	public double deposit(Account account, double amount);
	
	
	/**Supports withdrawal for specific {@code Account}
	 * 
	 * @param account under transaction
	 * @param amount to be withdrawal 
	 * @return new account balance
	 */
	public double withdraw(Account account, double amount);
	
}
