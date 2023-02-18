package com.onesoft.Functions;

public class UseFindMaximum {

	public static void main(String[] args) {
		FindMaximum f = new FindMaximum();
		System.out.println(f.findMaximum());
	}

}

class FindMaximum {
	public int findMaximum() {
		int a = 10;
		int b = 77;
		int c = 56;
		if(a>b && a>c) {
			return a;
		}
		else if(b>a && b>c) {
			return b;
		}
		else
			return c;
	}
}