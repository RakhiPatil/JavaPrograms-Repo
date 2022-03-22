package com.RakhiPatil;

import java.util.Random;

public class Dices {

	public static void main(String[] args) {
		Random random = new Random();

		int p = (random.nextInt()%6 +1);
		int q = (random.nextInt()%6 +1);
		System.out.println("Values on Dice are : (" +p +" , "+q +")");
		int sum = p +q;
		System.out.println("Sum :"+sum);
	}
}
