package com.tns.atm;


public class SavingsAccount extends ATM{
	boolean status;
	public static void savWithdraw (double newWithdraw) {
		if(bal < 10) {
			System.out.println("Not enough funds");
		}
		else {
			Withdraw(newWithdraw);
		}
	}
	public static void savDeposit(double newDepo) {
        if (bal < 10) {
            Deposit(newDepo);
            System.out.println("Savings account is now active.");
        } else {
            Deposit(newDepo);
        }
	}
	
}


