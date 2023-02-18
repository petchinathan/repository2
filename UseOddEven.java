package com.onesoft.Functions;

public class UseOddEven {

	public static void main(String[] args) {
		OddEven o = new OddEven();
		System.out.println("Odd="+o.findOddEven(3));
		System.out.println(o.findOddEven1(3));

	}

}

class OddEven {
	public boolean findOddEven(int num) {
		if(num%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String findOddEven1(int num) {
		if(num%2==0) {
			return "even";
		}
		else {
			return "odd";
		}
	}
}