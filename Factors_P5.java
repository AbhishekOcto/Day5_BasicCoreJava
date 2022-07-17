package com.bridgeLabz.CoreJava;

import java.util.Scanner;

public class Factors_P5 {

	/*Computes the prime factorization of N using brute force.
	 * */
	
	public static void main(String[] args) {
		int number;
		number = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		number = sc.nextInt();
		 sc.close();
		
		for(int i = 2; i< number; i++) {
	         while(number%i == 0) {
	            System.out.println(i+" ");
	            number = number/i;
	         }
	      }
	      if(number >2) {
	         System.out.println(number);
	      }
	}

}
