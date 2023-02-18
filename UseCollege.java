package com.onesoft.Functions;

public class UseCollege {

	public static void main(String[] args) {
		College c1 = new College();
		c1.name = "IRTT";
		c1.location = "erode";
		c1.fees = 100000;
		c1.grade = 'a';
		
		College c2 = new College();
		c2.name = "IIT";
		c2.location = "chennai";
		c2.fees = 300000;
		c2.grade = 'a';
		
		College c3 = new College();
		c3.name = "PSG";
		c3.location = "coimbatore";
		c3.fees = 200000;
		c3.grade = 'a';
		
		College[] colleges = {c1,c2,c3};
		
		System.out.println(c2.findMax(colleges));
		
	}

}

class College {
	String name;
	String location;
	int fees;
	char grade;
	public String findMax(College[] c) {
		int max = c[0].fees;
		String c1 = null;
		for(int i=0;i<c.length;i++) {
			if(c[i].fees>=max) {
				max = c[i].fees;
				c1 = c[i].name;
			}
		}
		return c1;
	}
}