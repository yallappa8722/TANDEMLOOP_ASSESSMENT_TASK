package com.test;

import java.util.Iterator;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x: ");
		int x = sc.nextInt();
		int count=0;
		int num=1;
		while(count < x) {
			System.out.print(num+", ");
			num+=2;
			count++;
		}
	}

}
