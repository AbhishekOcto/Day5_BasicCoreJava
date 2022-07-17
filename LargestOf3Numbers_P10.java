package com.bridgeLabz.CoreJava;
import java.util.Scanner;
public class LargestOf3Numbers_P10 {

/*Program to Find the Largest Among Three Numbers
 * 
 * */
	public static void main(String[] args) {
    int a,b,c,largest;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		 a = sc.nextInt();
		System.out.println("Enter Second Number: ");
		 b = sc.nextInt();
		System.out.println("Enter Third Number: ");
		 c = sc.nextInt();
		sc.close();
		
		//using comparision operators
		if ( a>b  && a>c )
			largest = a;
		
		
		else if ( b>a && b>c)
			largest = b;
		
		else
			largest = c;
		
		
		System.out.println("Largest Number is  " +largest);
		
	}

}
