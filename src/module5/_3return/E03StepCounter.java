package module5._3return;
import java.util.Scanner;

/*
 * A pedometer estimates that taking 2000 steps is the same as walking
 * one mile. Write a method convertToMiles that takes in a parameter
 * for steps and returns the number of miles walked. Then, call
 * the method from the main() method to test a few values.
 */
public class E03StepCounter {

    public static double convertToMiles(int steps) {
        return steps/2000.0;
    }
	//add convertToMiles method here

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many steps have you taken");
        int step = scan.nextInt();
        System.out.println(step + " steps is equivalent to " + convertToMiles(step) + " miles");
        scan.close();
    }
}
