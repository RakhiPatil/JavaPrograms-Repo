package com.RakhiPatil;

import java.util.Scanner;

public class FabonacciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstTerm = 0, secondTerm = 1;
		System.out.println("Enter the Maximum Number: ");
		int n = scanner.nextInt();
		
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstTerm + ", ");

	      // compute the next term
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
	}
}
