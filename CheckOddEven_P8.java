package com.bridgeLabz.CoreJava;
import java.util.Scanner;
public class CheckOddEven_P8 {
/* Program to Check Whether a Number is Even or Odd
 * 
 * */
	public static void main(String[] args) {
		/*
		 * Taking input from user
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a = sc.nextInt();
		sc.close();
		if (a % 2 == 0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
		
	}

}
