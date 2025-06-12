package Level_3;

import java.util.Scanner;

public class totalIncome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the salary and bonus: ");
		double salary = input.nextDouble();
		double bonus = input.nextDouble();
		double totalIncome = salary + bonus;
		System.out.println("The salary is INR " + salary + " and the bonus is INR " + bonus + ". Hence total income is INR " + totalIncome);
	}

}
