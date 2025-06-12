package Level_3;
import java.util.*;

public class temperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature in Celsius: ");
		double Celsius = input.nextDouble();
		double farenheitResult = (Celsius * ((9d)/(5d))) + 32;
		System.out.println("The " + Celsius + " celsius is " + farenheitResult + " fahrenheit");

	}

}
