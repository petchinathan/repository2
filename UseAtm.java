package com.onesoft.Functions;

public class UseAtm {

	public static void main(String[] args) {
		Atm atm1 = new Atm();
		atm1.bankName = "sbi";
		atm1.location = "palavakkam";
		atm1.creditAmount = 1000;
		atm1.mainBalance = 10000;
		atm1.withdrawelAmount = 2000;
		
		System.out.println(atm1.bankName+"-"+atm1.location+","+atm1.findCredit(atm1.mainBalance,atm1.creditAmount));
		System.out.println(atm1.bankName+"-"+atm1.location+","+atm1.findDebit(atm1.mainBalance, atm1.withdrawelAmount));
		
		
		Atm atm2 = new Atm();
		atm2.bankName = "iob";
		atm2.location = "palavakkam";
		atm2.creditAmount = 1000;
		atm2.mainBalance = 5000;
		atm2.withdrawelAmount = 2000;
		
		System.out.println(atm2.bankName+"-"+atm2.location+","+atm2.findCredit(atm2.mainBalance,atm2.creditAmount));
		System.out.println(atm2.bankName+"-"+atm2.location+","+atm2.findDebit(atm2.mainBalance, atm2.withdrawelAmount));
		
		Atm atm3 = new Atm();
		atm3.bankName = "iob";
		atm3.location = "palavakkam";
		atm3.creditAmount = 1000;
		atm3.mainBalance = 5000;
		atm3.withdrawelAmount = 2000;
		
		System.out.println(atm3.bankName+"-"+atm3.location+","+atm3.findCredit(atm3.mainBalance,atm3.creditAmount));
		System.out.println(atm3.bankName+"-"+atm3.location+","+atm3.findDebit(atm3.mainBalance, atm3.withdrawelAmount));
		
	}

}

class Atm {
	String bankName;
	String location;
	int mainBalance;
	int withdrawelAmount;
	int creditAmount;
	
	public String findDebit(int a,int b) {
		return "MainBalance After debit  is"+(a-b);
	}
	public String findCredit(int a,int b) {
		return "MainBalance After credit is"+(a+b);
	}
}