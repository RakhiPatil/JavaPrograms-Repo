package com.RakhiPatil;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		System.out.println("Enter the Number : ");
		a = scanner.nextInt();
		for(int b = 1; b <= a; b++) {
			if(a % b == 0) {
				System.out.println("\n"+b);
			}
		}
	}
}
