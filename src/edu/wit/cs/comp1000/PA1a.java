package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
		int yards;
		int feet;
		int inches;
		
		System.out.printf("enter the amount of yards:");
		yards = input.nextInt();
		
		System.out.printf("enter the amount of feet:");
		feet= input.nextInt();
		
		System.out.printf("enter the amount of inches:");
		inches = input.nextInt();
		
		int ans;
		ans= feet*12+yards*36+inches;
		System.out.printf("The total inches is %d%n", + ans);
		
	}

}
