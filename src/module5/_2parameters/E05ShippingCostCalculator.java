package module5._2parameters;

/*
 * Exercise: Add a method called calculateShipping that has
 * one parameter. Then, use this method to replace the redundant
 * code within the main method.
 */
import java.util.Scanner;

public class E05ShippingCostCalculator {
	public static void calculateShipping(double weight){
		double cost;
		if (weight < 15.0) {
			cost = 9.95;
		}
		else {
			cost = 12.95; 
		}
		System.out.println(cost);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How much does your package weigh");
		double weight = scan.nextDouble();
		System.out.println("------------------------------------------------------------------------");
		calculateShipping(weight);
		calculateShipping(22.0);
		calculateShipping(10.0);
		calculateShipping(12.0);
		scan.close();
	}
}
