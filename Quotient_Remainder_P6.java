package com.bridgeLabz.CoreJava;
import java.util.Scanner;
public class Quotient_Remainder_P6 {

	/*Java Program to Compute Quotient and Remainder
	 * 
	 * */
	
	public static void main(String[] args) {
		//taking user input..
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Dividend: ");
		int Divident = sc.nextInt();
		
		System.out.print("Enter Divisor: ");
		int Divisor = sc.nextInt();
		
		sc.close();
		
		
		int quotient= Divident / Divisor;
		int remainder= Divident % Divisor;
		
		System.out.println("Quotient= " +quotient);
		System.out.println("Remainder= " +remainder);

	}

}
