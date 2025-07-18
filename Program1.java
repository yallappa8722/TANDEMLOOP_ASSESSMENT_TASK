package com.test;

import java.util.Scanner;

public class CArithmaticOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Well come to calculator");
			System.out.println("Enter num1 :");
			Double a = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Enter Operator :");
			String operator = sc.nextLine();
			
			System.out.println("Enter num2 :");
			Double b = sc.nextDouble();

			switch (operator) {
			case "+": {
				System.out.println("Addition of two number = "+ (a+b));
				break;
			}
			case "-": {
				System.out.println("SubStraction of two number = "+ (a-b));
				break;
			}
			
			case "*": {
				System.out.println("Multiflication of two number = "+(a*b));
				break;
			}
			
			case "/": {
				System.out.println("Division of two number = "+(a/b));
				break;
			}
			
			default:
				System.out.println("Invalid operator. Please use +, -, *, or /");

			}
		}
		
		
		
				
	}
}
