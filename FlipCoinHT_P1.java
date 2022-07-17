package com.bridgeLabz.CoreJava;
import java.util.Scanner;
public class FlipCoinHT_P1 {

	public static void main(String[] args) {
			
				int heads;
				heads = 0;
				int tails=0;
				int count=1;
				double Random=0.0;
				
				//taking input from user
				
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the number:  ");
				int flips = sc.nextInt();
				
				sc.close(); //closing the scanner
				
				while (count <= flips) {
					Random = Math.random();
					System.out.println(count+ " " +Random);
					
					
					if (Random < 0.5) {
						heads++;
						System.out.println("heads");
					}
					else {
						tails++;
						System.out.println("tails");
					}
						count++;
				}
					System.out.println("Number of Heads : " +heads);
					System.out.println("Number of Tails : " +tails);
					
					double headpercentage = (double)heads/flips*100;
					double tailpercentage = (double)tails/flips*100;
					
					
					System.out.println("Percentage of Heads = %" +headpercentage);
					System.out.println("Percentage of Tails = %" +tailpercentage);
					
				
	}

}
