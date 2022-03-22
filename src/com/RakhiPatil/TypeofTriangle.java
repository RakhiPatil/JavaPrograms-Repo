package com.RakhiPatil;

import java.util.Scanner;

public class TypeofTriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 sides of Triangle :");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if((a*a) + (b*b) == (c*c)) {
			System.out.println("This is a Right Angled Triangle");
		}else if((a*a) + (b*b) < (c*c)) {
			System.out.println("This is Acute Angled Triangle");
		}else {
			System.out.println("This is Obtuse Angles Triangle");
		}
	}
}
