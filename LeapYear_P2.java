package com.bridgeLabz.CoreJava;
import java.util.Scanner;
public class LeapYear_P2 {
		
		int year;
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the year of your choice: "); //taking input from user
			int year = sc.nextInt();
			sc.close();
			
			if (year%100==0 && year%400==0 || year%100!=0  && year%4==0) // logic for finding lepap year
			{
				System.out.println("Leap Year");
			}
			
			else 
			{
				System.out.println("Not Leap Year");
			}

	}

}
