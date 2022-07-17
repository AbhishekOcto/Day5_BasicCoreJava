package com.bridgeLabz.CoreJava;
import java.util.Scanner;
public class HarmonicNumber_P4 {
	/* Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
	 * 
	 * */
	public static void main(String[] args) {
		int N;
		N = 1;
		double result;
		result = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		N = sc.nextInt();
		sc.close();
		
		System.out.println("the harmonic series is: ");
		// printing the harmonic series till num value
        // using while loop
        while (N > 0) {
 
            // calculating harmonic values
            result = result + (double)1 / N;
 
            /* after calculating harmonic value
             decrementing num by 1 which means the common
            difference is 1
            */
            
            N--;
            System.out.print(result + ", ");
        }	
		
	}

}
