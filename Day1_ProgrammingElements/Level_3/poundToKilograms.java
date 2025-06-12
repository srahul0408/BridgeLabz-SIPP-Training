package Level_3;

import java.util.Scanner;

public class poundToKilograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the weight in pounds: ");
		double pounds = input.nextDouble();
		double kilograms = pounds * 2.2d;
		System.out.println("The weight of the person in pounds is " + pounds + " and in kg is " + kilograms);

	}

}
