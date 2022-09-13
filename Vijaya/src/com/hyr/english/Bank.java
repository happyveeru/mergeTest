package com.hyr.english;

public class Bank {
	static int currentBalance = 1000;
	public static void greetCustomer() {
		System.out.println("hello, Welcome to the banking");
		
	}
public void deposit(int amount) {
	currentBalance = currentBalance + amount;
	System.out.println("Amount is deposit successfull");
}

public void withdrawal(int amount) {
	currentBalance = currentBalance - amount;
	System.out.println("Amount is withdrawan succefully");
}

public int getCurrentBalance() {
	return currentBalance;
}

public static void main(String[] args) {
	greetCustomer();
	Bank bank = new Bank();
	greetCustomer();
	System.out.println("current balance is :" + bank.getCurrentBalance());
	bank.deposit(500);
System.out.println("CurrentBalance is : "+ bank.getCurrentBalance());
bank.withdrawal(300);
System.out.println("CurrentBalance is : "+ bank.getCurrentBalance());
	
	
}
}