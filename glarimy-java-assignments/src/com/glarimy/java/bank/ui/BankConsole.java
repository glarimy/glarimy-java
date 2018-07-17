package com.glarimy.java.bank.ui;

import com.glarimy.java.bank.api.Account;
import com.glarimy.java.bank.api.AccountNotFoundException;
import com.glarimy.java.bank.api.Bank;
import com.glarimy.java.bank.api.BankException;
import com.glarimy.java.bank.api.Customer;
import com.glarimy.java.bank.api.InsufficientBalanceException;
import com.glarimy.java.bank.api.InvalidInputException;
import com.glarimy.java.bank.biz.SimpleBank;

public class BankConsole {

	public static void main(String[] args) {
		Bank bank = SimpleBank.getInstance();

		try {
			int number = bank.openAccount(new Customer("Krishna", 9731423166L));
			bank.deposit(number, 100);
			bank.deposit(number, 200);
			bank.deposit(number, 150);
			bank.deposit(number, 600);
			bank.withdraw(number, 100);
			Account account = bank.find(number);
			System.out.println("Account Details:" + account);
		} catch (InvalidInputException iie) {
			System.out.println("Invalid Input");
		} catch (InsufficientBalanceException isbe) {
			System.out.println("Balance insufficient");
		} catch (AccountNotFoundException anfe) {
			System.out.println("Account not found");
		} catch (BankException be) {
			System.out.println("Internal error");
		}

	}

}
