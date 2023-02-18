package com.onesoft.Functions;

public class UseMaximum {

	public static void main(String[] args) {
		int[] nums = {3,6,5,7,9,2};
		Maxmimum m = new Maxmimum();
		System.out.println("MAx="+m.findMax(nums));
		m.findMin(nums);
	}

}

class Maxmimum {
	public int findMax(int[] a) {
		int max = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>=max) {
				max = a[i];
			}
		}
		return max;
	}
	public void findMin(int[] a) {
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<=min) {
				min = a[i];
			}
		}
		System.out.println("MIN="+min);
	}
}
