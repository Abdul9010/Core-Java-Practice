package com.dl.one;

public class Switch {

	public static void main(String[] args) {
		
		int salary = 20000;
		
		switch (salary) {
		case 10000:
			System.out.println("salary is 1000");
			break;
		case 20000:
			System.out.println("salary is 2000");
			break;
		case 30000:
			System.out.println("salary is 3000");
			break;
		case 40000:
			System.out.println("salary is 4000");
			break;
		case 50000:
			System.out.println("salary is 5000");
			break;
		case 60000:
			System.out.println("salary is 6000");
			break;

		default:
			System.out.println("Salary error");
			break;
		}

	}

}
