package com.dl.one;

public class Bank {

	public static void main(String[] args) {
	
		Bank bank = new Bank();
		
		bank.detail("ayaan", "ayaan@gmail.com", 8888888l);
	}
	
	public void detail(String name, String email, long number) {
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(number);
		
		
	}

}
