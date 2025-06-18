package Level_1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		int[] table = new int[10];
		for(int i = 0; i < table.length; ++i) {
			table[i] = number * (i+1);
		}
		for(int i = 0; i < table.length; ++i) {
			System.out.println(number + " * " + (i+1) + " = " + table[i]);
		}

	}

}
