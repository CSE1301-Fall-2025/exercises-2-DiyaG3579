package module4._02graphics;

import java.awt.Color;

import java.util.Scanner;

import java.awt.event.KeyEvent;

import edu.princeton.cs.introcs.StdDraw;

public class E05MovingBall {

	/*
	 * Exercise: Read and run the code below and make sure you
	 * understand how it works before proceeding.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many balls would you like?");
		int n = scan.nextInt();
		System.out.println("What level of difficulty would you like? (Choose a value from 1 to 5)");
		double v = scan.nextDouble();
		double c = 0.0;
		if (v == 1) {
			c = 0.01;
		}
		else if (v == 2) {
			c = 0.02;
		}
		else if (v==3) {
			c = 0.03;
		}
		else if (v == 4){
			c = 0.04;
		}
		else {
			c = 0.05;
		}

		double [] ballX = new double [n];
		double [] ballXVelocity = new double [n];
		double [] bally = new double [n];
		double [] ballYVelocity = new double [n];
		

		for (int i = 0; i < n; i++) {
			ballX[i] = Math.random();
			bally[i] = Math.random();
			ballXVelocity[i] = Math.random() * c;
			ballYVelocity[i] = Math.random() * c;
		}


		double playerX = 0.5;
		double playerY = 0.5;
		double playerSpeed = 0.01;
		
		int score = 0;
		long currentTime = System.currentTimeMillis();

		StdDraw.setPenColor(Color.MAGENTA);
		StdDraw.setPenRadius(0.05);
		double distance = 1.0;
		//1. Animation loop: one frame draw per iteration
		while (distance > 0.05) {

			//Clear the canvas (Remove the prior frame)
			StdDraw.clear();

			//StdDraw.rectangle(0.0,0.5,0.08,0.01);
			//2. Change the positions of all moving objects
			for (int i = 0; i < n; i++) {
				ballX[i] = ballX[i] + ballXVelocity[i];
				bally[i] = bally[i] + ballYVelocity[i];

				if(ballX[i] > 1 || ballX[i] < 0) { //too far right
					ballXVelocity[i] = -ballXVelocity[i]; //back to left
				}
			
				if (bally[i] > 1 || bally[i] < 0) {
					ballYVelocity[i] = - ballYVelocity[i];
				}
		}

			if (StdDraw.isKeyPressed(KeyEvent.VK_W)) {
				playerY = playerY + playerSpeed;
			}

			else if (StdDraw.isKeyPressed(KeyEvent.VK_S)) {
				playerY = playerY - playerSpeed;
			}

			else if (StdDraw.isKeyPressed(KeyEvent.VK_A)) {
				playerX = playerX - playerSpeed;
			}

			else if (StdDraw.isKeyPressed(KeyEvent.VK_D)) {
				playerX = playerX + playerSpeed;
			}
			
			long now = System.currentTimeMillis();
			if (now- currentTime > 1000) {
				score++;
				currentTime = now;
			}

			int highscore = score;
			if (highscore > score) {
				highscore = score;
			}

			//Check for Collisons
			for (int i = 0; i < n; i ++) {
				double x = Math.pow(playerX - ballX[i], 2);
				double y = Math.pow(playerY - bally[i], 2);
				distance = Math.sqrt(x + y);
			}

			//draw on canvas
			for (int i = 0; i < n; i++) {
			StdDraw.setPenColor(Color.MAGENTA);
			StdDraw.point(ballX[i], bally[i]);
			}
			StdDraw.setPenColor(Color.BLUE);
			StdDraw.point(playerX, playerY);

			StdDraw.setPenColor(Color.BLACK);
			StdDraw.text(0.9,0.9, "Score: " + score);
			//StdDraw.text(0.5,0.9,"High Score: " + highscore);

			//pause to make the animation smooth
			StdDraw.show();
			StdDraw.pause(10);
			
		}
			StdDraw.clear();
			StdDraw.setPenColor(Color.RED);
			StdDraw.rectangle(0.5,0.5,0.5,0.5);
			StdDraw.setPenColor(Color.BLACK);
			StdDraw.text(0.5,0.5,"You Lost, Final Score: " + score);
	}
}
