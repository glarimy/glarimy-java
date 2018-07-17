package com.glarimy.java.bank.api;

public interface Bank {
	public int openAccount(Customer customer) throws InvalidInputException, BankException;

	public double deposit(int accountNumber, double amount)
			throws InvalidInputException, AccountNotFoundException, BankException;

	public double withdraw(int accountNumber, double amount)
			throws InvalidInputException, AccountNotFoundException, InsufficientBalanceException, BankException;

	public Account find(int accountNumber) throws AccountNotFoundException, BankException;
}
