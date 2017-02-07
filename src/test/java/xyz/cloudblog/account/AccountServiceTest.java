package xyz.cloudblog.account;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import xyz.cloudblog.account.bean.Account;

public class AccountServiceTest {

	private AccountService aService;
	private Account account;
	@Before
	public void setUp() throws Exception {
		aService = new AccountServiceImpl();
		account = new Account(12344L, 2134.235);
	}

	@After
	public void tearDown() throws Exception {
		aService = null;
	}

	@Test
	public void testCheckBalance() {
		Double aBalance = aService.checkBalance(account);
		assertEquals(account.getBalance(), aBalance);
	}

	@Test
	public void testDeposit(){
		Double newBalance = aService.deposit(account, 100d);
		Double expected = account.getBalance() + 100d;
		assertEquals(expected, newBalance); 
	}
	
	@Test
	public void testWithdrawal(){
		Double newBalance = aService.withdraw(account, 100d);
		Double expected = account.getBalance() - 100d;
		assertEquals(expected, newBalance); 
	}
}
