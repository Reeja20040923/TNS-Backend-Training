package com.tns.atm;


import java.util.Scanner;

public class Main extends SavingsAccount{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String choice;
		int num = 0;
		System.out.println("Choose an account: 1.Regular / 2.Savings");
		choice = in.next();
		if(choice.equals("Regular")) {
			num = 0;
		}
		if(choice.equals("Savings")) {
			num = 1;
		}
		
		switch (num) { 
		   case 0:
			   System.out.println("What action do you wish to perform \n(Withdraw, deposit)?:");
			   choice = in.next();
			   if(choice.equals("Withdraw")) {
				   num = 0;
			   }
			   if(choice.equals("Deposit")) {
				   num = 1;
			   }
			   switch (num) {
			      case 0:
			    	  System.out.println("Enter amount to withdraw:");
			    	  Withdraw(in.nextDouble());
			    	  break;
			      case 1:
			    	  System.out.println("Enter amount to deposit:");
			    	  Deposit(in.nextDouble());
			    	  break;
			   
			   }
			   break;
		   case 1:
			   System.out.println("What action do you wish to perform \n(Withdraw, deposit)?:");
			   choice = in.next();
			   if(choice.equals("Withdraw")) {
				   num = 0;
			   }
			   if(choice.equals("Deposit")) {
				   num = 1;
			   }
			   switch(num) {
			      case 0:
			    	  System.out.println("Enter amount to withdraw:");
			    	  savWithdraw(in.nextDouble());
			    	  break;
			    	  
			      case 1:
			    	  System.out.println("Enter amount to deposit:");
			    	  savDeposit(in.nextDouble());
			    	  
			   }
			   in.close();
			   
		}
		
	}

}
