package com.onesoft.Functions;

public class UseSquareCube {

	public static void main(String[] args) {
		SquareCube s = new SquareCube();
		System.out.println("SQUARE= "+s.square(2));
		System.out.println("CUBE= "+s.cube(2));
	}

}

class SquareCube {
	public int square(int num) {
		return num*num;
	}
	public int cube(int num) {
		return num*num*num;
	}
}