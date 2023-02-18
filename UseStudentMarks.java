package com.onesoft.Functions;

public class UseStudentMarks {

	public static void main(String[] args) {
		StudentMarks s = new StudentMarks();
		s.displayMarks(100, 50, 80, 60, 70);
		s.findTotal(100, 50, 80, 60, 70);
		s.findAverage(100, 50, 80, 60, 70);
	}

}

class StudentMarks {
	public void displayMarks(int tamil,int english,int maths,int science,int social) {
		System.out.println(tamil+","+english+","+maths+","+science+","+social);
	}
	public void findTotal(int tamil,int english,int maths,int science,int social) {
		System.out.println("TOTAL= "+(tamil+english+maths+science+social));
	}
	public void findAverage(int tamil,int english,int maths,int science,int social) {
		int total=tamil+english+maths+science+social;
		int avg = total/5;
		System.out.println("AVG="+avg);
	}
}