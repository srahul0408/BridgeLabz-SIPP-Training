package Level_3;

import java.util.Scanner;

public class userTravels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of the user and from city, via city, and to city:");
		String name = input.nextLine();
		String fromCity = input.nextLine();
		String viaCity = input.nextLine();
		String toCity = input.nextLine();
		System.out.println("Enter the distances in miles form to via and via to final city in miles: ");
		double fromToVia = input.nextDouble();
		double viaToFinalCity = input.nextDouble();
		System.out.println("Enter the time taken from city to via city and via city to final destination: ");
		double timeFromToVia = input.nextDouble();
		double timeViaToFinalCity = input.nextDouble();
		
		double totalDistanceTravelled = (fromToVia + viaToFinalCity) * 1.6d;
		double totalTimeTaken = timeFromToVia + timeViaToFinalCity;
		
		System.out.println("The total distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistanceTravelled + " km and the total time taken is " + totalTimeTaken + " minutes");
		
		
	}

}
