package conditionalStatements;
import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = sc.nextInt();
		
		//if condition
		if(input>0) {
			System.out.println("Positive Number");
		}
		//else if condition
		else if(input<0) {
			System.out.println("Negative Number");
		}
		//else condition
		else {
			System.out.println("Zero");
		}
		
	}
		

	

}
