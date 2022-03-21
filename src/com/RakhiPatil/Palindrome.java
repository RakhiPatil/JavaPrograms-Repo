package com.RakhiPatil;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int num , reversedNum = 0, remainder = 0;
	    System.out.println("Enter the Number:");
	    num = scanner.nextInt();
	   
	    int originalNum = num;
	  
	    while (num != 0) {
	      remainder = num % 10;
	      reversedNum = reversedNum * 10 + remainder;
	      num /= 10;
	    }
	    
	    if (originalNum == reversedNum) {
	      System.out.println(originalNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(originalNum + " is not Palindrome.");
	    }
	  }
}
