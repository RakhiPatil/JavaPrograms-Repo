package com.RakhiPatil;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int a, b, n, result = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 digit Number: ");
		n = scanner.nextInt();
		a=n;
		while(a != 0) {
			b = a % 10;
			result = result + (b*b*b);
			a = a / 10;
		}
		if(result == n) {
			System.out.println("Number is Armstrong");
		}else {
			System.out.println("Number is not Armstrong");
		}
	}

}
