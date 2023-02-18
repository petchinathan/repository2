package com.onesoft.Functions;

public class UseCalculator {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(10,2));
		System.out.println(c.sub());
		c.multi(10, 2);
		c.div();
		
	}

}

class Calculator {
	public int add(int a,int b) {
		return a+b;
	}
	public int sub() {
		int a = 10;
		int b = 5;
		return a-b;
	}
	public void multi(int a, int b) {
		System.out.println(a*b);
	}
	public void div() {
	int a = 10;
	int b = 5;
	System.out.println(a/b);
	}
}
