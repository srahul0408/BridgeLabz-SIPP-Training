package Level_3;

import java.util.Scanner;

public class chocolateDistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of chocolates and the number of children: ");
		int numberOfChocolates = input.nextInt();
		int numberOfChildren = input.nextInt();
		int distributedToChilds = numberOfChocolates / numberOfChildren;
		int remainingChocolates = numberOfChocolates % numberOfChildren;
		System.out.println("The number of chocolates each child gets is " + distributedToChilds + " and the number of remaining chocolates is " + remainingChocolates);

	}

}
