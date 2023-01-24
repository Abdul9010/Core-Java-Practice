package com.dl.one;

public class Method {
	
	public static void main(String[] args) {
		
		Method method = new Method();
		method.details("ayaan", "smart", "ayaan@gmail.com", 8888888l);
		Method.bank("ICICI");
		
		
		method.details("abdul", "smart", "abdul@gmail.com", 55555555l);
		method.bank("ICICI");
	}
	
	public void details(String firstname,String lastname, String email, long number) {
		
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(email);
		System.out.println(number);
		
		
	}
	
	public static void bank(String aa) {
		
		System.out.println(aa);
		
	}
	
}