package Level_3;

import java.util.Scanner;

public class simpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the principal, rate, and time: ");
		double principal = input.nextDouble();
		double rate = input.nextDouble();
		double time = input.nextDouble();
		double simpleInterest = (principal * rate * time) / 100d;
		System.out.println("The simple interest is " + simpleInterest + " for principal " + principal + ", rate of interest " + rate + " and time " + time);

	}

}
