package Level_3;

import java.util.Scanner;

public class roundCompleteByAthlete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side1, side2, and side3: ");
		double distance = 5;
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		double perimeter  = side1 + side2 + side3;
		double numberOfRounds = distance / perimeter;
		System.out.println("The total number of rounds the athlete will run is " + numberOfRounds + " to complete 5 km");
	}

}
