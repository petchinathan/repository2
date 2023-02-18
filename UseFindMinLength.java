package com.onesoft.Functions;

public class UseFindMinLength {

	public static void main(String[] args) {
		FindMinLength f = new FindMinLength();
		f.findMin();
	}

}

class FindMinLength {
	public void findMin() {
		String[] a = {"petchi","jo","raju"};
		int min = a[0].length();
		String name = null;
		for(int i=0;i<a.length;i++) {
			if(a[i].length()<=min) {
				min = a[i].length();
				name = a[i];
			}
		}
		System.out.println(name+","+min);
	}
}