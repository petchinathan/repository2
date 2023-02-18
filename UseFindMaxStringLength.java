package com.onesoft.Functions;

public class UseFindMaxStringLength {

	public static void main(String[] args) {
		FindMaxStringLength f = new FindMaxStringLength();
		String[] names = {"petchi","prasanth","jo","raju"};
		int length = f.findMaxLength(names).length();
		System.out.println("Max="+f.findMaxLength(names)+" Length="+length);
	}

}

class FindMaxStringLength {
	public String findMaxLength(String[] a) {
		int max = a[0].length();
		String name = null;
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>=max) {
				max = a[i].length();
				name = a[i];
			}
		}
		return name;
	}
}
