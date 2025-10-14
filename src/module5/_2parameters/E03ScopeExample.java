
package module5._2parameters;
import java.util.Scanner;

/*
 * Use the debugger to step through this example. Can you see
 * the "inches" and "centimeters" variables from the main method?
 */
public class E03ScopeExample {
	
	public static void inchesToCentimeters(double inches) {
		double centimeters = inches * 2.54;
		System.out.println(inches + " in --> " + centimeters + " cm");
	}

	public static void centimetersToInches(double centimeters) {
		double inches = centimeters/2.54;
		System.out.println(centimeters + " cm --> " + inches + " in");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Type 1 to Convert to Centimeters. Type 2 to Convert to Inches");
		int sel = scan.nextInt();
		if (sel == 1) {
			System.out.println("What value would you like to convert to centimeters");
			double num = scan.nextDouble();
			inchesToCentimeters(num);
		}
		if (sel == 2) {
			System.out.println("What value would you like to convert to inches");
			double num = scan.nextDouble();
			centimetersToInches(num);
		}
		scan.close();
	}

}
