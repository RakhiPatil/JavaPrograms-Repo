package com.RakhiPatil;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("Random 5 Numbers are: ");
		for(int a = 1; a <= 5; a++) {
			System.out.println(random.nextInt()%90 + 10);
		}
	}
}
