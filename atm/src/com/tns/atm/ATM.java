package com.tns.atm;

public class ATM {
	static double  bal;
	static double depo;
	static double withdraw;
	
	public static void BankAccount(double newBal) {
		bal = newBal;
		
	}
	
	public static void Deposit(double newDepo) {
		bal = bal+newDepo;
		double nd = depo++;
		System.out.println("Succesfully deposited " + nd + " Rupees"  );
	}
	
	public static void Withdraw(double newWithdraw) {
		bal = bal - newWithdraw;
		double nw = withdraw++;
		System.out.println("Succesfully withdrawn " + nw + " Rupees"  );
	}
	
	

}
