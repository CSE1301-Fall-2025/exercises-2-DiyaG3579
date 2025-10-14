package module5._2parameters;

/*
 * Exercise: Create a calculatePay method and use it to replace
 * the redundant code within the main method.
 */
public class E02PayrollCalculator {
	//add a new static method calculatePay here
	//Basically this is where we define the function - what we want the code to run
	public static void calculator(String employee, double hourlyRate, double hoursWorked) {
		double weeklyPay;
		weeklyPay = hourlyRate * hoursWorked;
		System.out.println(employee + ": " + weeklyPay);
	}


	public static void main(String[] args) {
		//This is where the code is actually run, it reads calculator and then marks each part of the parenthesis
		//double hourlyRate, hoursWorked, weeklyPay;
	      //String employee;
		calculator("Fred",12.50,20);
		calculator("Amir",15.0,35);
		calculator("John",18.9,40);
	      //Calculate weekly pay for Fred
	      //employee = "Fred";
	      //hourlyRate = 12.50;
	      //hoursWorked = 20;
	      //weeklyPay = hourlyRate * hoursWorked;
	      //System.out.println(employee  + ":" + weeklyPay);
	      //Calculate weekly pay for Amir 
	      //employee = "Amir";
	      //hourlyRate = 15.0;
	      //hoursWorked = 35;
	      //weeklyPay = hourlyRate * hoursWorked;
	      //System.out.println(employee  + ":" + weeklyPay);
	}
}

