package module5._3return;
import java.util.Scanner;

/*
 * Exercise: Write a method randomNumberInRange() that takes in two
 * integer parameters, min and max, and returns a random integer value
 * from within that range (inclusive). Test your method by calling it
 * from the main method.
 */
public class E04RandomNumberInRange {
	public static int randomNumberInRange(int min, int max) {
		return (int)((Math.random() * (max-min) ) + min);
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a minimum value");
		int min = scan.nextInt();
		System.out.println("Please enter a maximum value");
		int max = scan.nextInt();
		System.out.println("--------------------------------");
		System.out.println(randomNumberInRange(min,max));
		scan.close();
	}
}
