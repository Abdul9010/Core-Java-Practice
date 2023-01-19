package com.dl.one;

public class Eg2 {

	public static void main(String[] args) {
		// Assignment Operators += -= /= *= %=
		int a = 10;
		int b = 20;
		int c = 10;
		
		System.out.println(a += b); //30// a= a+b // a = 10+20 = 30
		System.out.println("in memory a is 30");
		System.out.println(a -= c); // 20 // a = 30-10 = 20 
		System.out.println(b *= c); //   // b = 20*10 = 200
		System.out.println("in memory b is 200 ");
		System.out.println(b /= a); // 20 // c = 200/10 = 10
		System.out.println(b %= a); // 0
		
		int x = 15;
		int y = 30;
		
		System.out.println(x /= y);
		System.out.println(x %= y);

	}

}
