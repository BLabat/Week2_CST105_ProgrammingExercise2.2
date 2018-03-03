/** Program: Programming Exercise 2.2
 * File: ConvertingDegrees.java
 * Summary: Converts fahrenheit to celcsius and celsius to Fahrenheit
 * Author: Brandon Labat
 * Date: March 3, 2018
 */
import java.util.Scanner;

public class ConvertingDegrees {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		//Convert Fahrenheit to Celsius
		double celsius =(5.0/9) * (fahrenheit-32);
		System.out.println("Fahrenheit " + fahrenheit + " is " + 
		celsius + " in Celsius");
		
		System.out.print("Enter a degree in Celsius:");
		double cels = input.nextDouble();
		
		//Convert Celsius to Fahrenheit
		double fah = cels * (9.0/5) + 32;
		System.out.println("Celsius " + cels + " is " + fah + " in Fahrenheit");
	}
}
  