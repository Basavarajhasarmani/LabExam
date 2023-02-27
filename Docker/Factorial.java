package com.acts;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the number to find its factorial ");
			int num=sc.nextInt();
			
			int factorial=1;
			while(num != 0) {
				factorial = factorial * num;
				num--;
			}
			 System.out.println("Factorial of a given number is -->  " + factorial);
			
		}

	}

}
