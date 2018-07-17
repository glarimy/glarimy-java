package com.glarimy.java.bank.biz;

import com.glarimy.java.bank.api.Account;
import com.glarimy.java.bank.api.AccountNotFoundException;
import com.glarimy.java.bank.api.Bank;
import com.glarimy.java.bank.api.BankException;
import com.glarimy.java.bank.api.Customer;
import com.glarimy.java.bank.api.InsufficientBalanceException;
import com.glarimy.java.bank.api.InvalidInputException;

public class SimpleBank implements Bank {
	private Account[] ledger;
	private static int NUMBER;
	private static SimpleBank INSTANCE;
	private int index = 0;

	private SimpleBank() {
		ledger = new Account[10];
	}

	public static synchronized SimpleBank getInstance() {
		if (INSTANCE == null)
			INSTANCE = new SimpleBank();
		return INSTANCE;
	}

	@Override
	public int openAccount(Customer customer) throws InvalidInputException, BankException {
		if (customer == null || customer.getName() == null || customer.getName().trim().length() == 0
				|| customer.getPhoneNumber() < 1)
			throw new InvalidInputException();
		
		Account account = new Account();
		account.setCustomer(customer);
		account.setNumber(++NUMBER);
		ledger[index++] = account;
		return account.getNumber();
	}

	@Override
	public double deposit(int accountNumber, double amount)
			throws InvalidInputException, AccountNotFoundException, BankException {
		if (accountNumber < 1 || amount < 100)
			throw new InvalidInputException();

		for (int i = 0; i < index; i++) {
			if (ledger[i].getNumber() == accountNumber) {
				Account account = ledger[i];
				account.setBalance(account.getBalance() + amount);
				return account.getBalance();
			}
		}
		throw new AccountNotFoundException();

	}

	@Override
	public double withdraw(int accountNumber, double amount)
			throws InvalidInputException, AccountNotFoundException, InsufficientBalanceException, BankException {
		if (accountNumber < 1 || amount < 100)
			throw new InvalidInputException();

		for (int i = 0; i < index; i++) {
			if (ledger[i].getNumber() == accountNumber) {
				Account account = ledger[i];
				if (account.getBalance() < amount)
					throw new InsufficientBalanceException();
				account.setBalance(account.getBalance() - amount);
				return account.getBalance();
			}
		}
		throw new AccountNotFoundException();
	}

	@Override
	public Account find(int accountNumber) throws AccountNotFoundException, BankException {
		for (int i = 0; i < index; i++) {
			if (ledger[i].getNumber() == accountNumber)
				return ledger[i];
		}
		throw new AccountNotFoundException();
	}

}
