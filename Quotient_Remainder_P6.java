package com.bridgeLabz.CoreJava;
import java.util.Scanner;
public class Quotient_Remainder_P6 {

	/*Java Program to Compute Quotient and Remainder
	 * 
	 * */
	//changes
	
	public static void main(String[] args) {
		//taking user input..
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Dividend: ");
		int Dividend = sc.nextInt();
		
		System.out.print("Enter Divisor: ");
		int Divisor = sc.nextInt();
		
		sc.close();
		
		
		int quotient= Dividend / Divisor;
		int remainder= Dividend % Divisor;
		
		System.out.println("Quotient= " +quotient);
		System.out.println("Remainder= " +remainder);

	}

}
