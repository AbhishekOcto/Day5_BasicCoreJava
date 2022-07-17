package com.bridgeLabz.CoreJava;
import java.util.Scanner;
public class CheckVowelConsonant_P9 {
/*Program to Check Whether an Alphabet is Vowel or Consonant
 * 
 * */
	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any character: ");
		ch = sc.next().charAt(0);
		sc.close();
		
		if (ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u') {
			
				System.out.println("Character is vowel");
		}
			
			else {
				System.out.println("Character is consonant");
			}
		

	}

}
