package com.bridgeLabz.CoreJava;
import java.util.Scanner;
public class PowerOf2_P3 {
    /*
     * This program takes a command-line argument N and prints a table of the
powers of 2 that are less than or equal to 2^N.

     * */
	
	
	public static void main(String[] args) {
		int number;
		number = 0;
		
		Scanner sc = new Scanner(System.in);
    System.out.print("Choose your number: ");
    number = sc.nextInt();
		sc.close();
		
		System.out.println("Power of 2^"+number+" is: "+(Math.pow(2, number)));
       
        System.out.println("Printing all till Power Value: "+number);
        
        
        
        for(int i=1; i<=number; i++)
        {
         	System.out.println("Power of 2^"+i+" is: "+(Math.pow(2, i)));	
        }
		
		

	}

}
