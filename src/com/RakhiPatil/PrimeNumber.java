package com.RakhiPatil;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i, count, n;
		System.out.println("Enter the Max number: ");
		n = scanner.nextInt();
		System.out.println("Prime Numbers between 1 and "+n+" are: ");
		
		for(int j = 2; j <= n; j++) {
			count = 0;
			for( i = 1; i <= j; i++) {
				if(j % i == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.print(j+"  "); 
			}
		}
	}
}
