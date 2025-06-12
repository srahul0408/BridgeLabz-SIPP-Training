package Level_3;

import java.util.Scanner;

public class numberSwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number1 and number2: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int swap = number1;
		number1 = number2;
		number2 = swap;
		System.out.println("The swapped numbers are " + number1 + " and " + number2);
	}

}
