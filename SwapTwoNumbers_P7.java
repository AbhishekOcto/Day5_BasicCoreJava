package com.bridgeLabz.CoreJava;
import java.util.Scanner;
public class SwapTwoNumbers_P7 {
/*Java Program to Swap Two Numbers
 * 
 * */
	public static void main(String[] args) {
		System.out.println("Before Swapping");
		//Taking user input..
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number = ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number = ");
		int b = sc.nextInt();
		sc.close();
		//Value of first number is assigned to temporary
		int temporary= a;
		
		//Value of first number is assigned to second number
		 
		a=b;
		//Value of temporary is assigned to second number
		
		b= temporary;
		
		System.out.println("After Swapping");
		System.out.println("First number = " +a);
		System.out.println("Second number = " +b);

	}

}
