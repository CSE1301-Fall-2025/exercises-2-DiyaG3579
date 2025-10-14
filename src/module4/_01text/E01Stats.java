package module4._01text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class E01Stats {

	/*
	 * Exercise: The below code reads in a series of doubles from a file and prints them.
	 * Modify this code to find the maximum, minimum, average, and count of the values
	 * read in from the file.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		//Code for setting up Scanner with a file
		//Not your responsibility to understand this part!
		JFileChooser chooser = new JFileChooser("datafiles");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File

		//Using scanner to read from a file
		//Modify and add to the code below
		//to complete the exercise
		int g = 0;
		while(in.hasNextDouble()) {
			double h = (in.nextDouble());
			g++;
		}

		Scanner in2 = new Scanner(f);
		double [] data = new double [g];
		while(in2.hasNextDouble()) {
			for (int i = 0; i < data.length; i++) {
		 		data[i] = in2.nextDouble();
		 		//System.out.println(data[i]);
		 	}
		}
		double max = 0.0;
		double min = 1000.0;
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
			if (data[i] < min) {
				min = data[i];
			}
		}
		System.out.println("Max: " + max + " Min: " + min);
		in.close();
		in2.close();

		
}
} 