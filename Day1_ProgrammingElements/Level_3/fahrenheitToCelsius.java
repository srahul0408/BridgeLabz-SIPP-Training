package Level_3;

import java.util.Scanner;

public class fahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit: ");
		double Fahrenheit = input.nextDouble();
		double celsiusResult = (Fahrenheit - 32) * (5d/9d);
		System.out.println("The " + Fahrenheit + " Fahrenheit is " + celsiusResult + " celsiusResult");

		
	}

}
