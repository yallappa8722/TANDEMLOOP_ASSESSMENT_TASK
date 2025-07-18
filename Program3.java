package com.test;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x: ");
		int x = sc.nextInt();
		int num=1;
		for(int i=0; i<x; i++) {
			if(x%2==0) {
				x-=1;
			}
			System.out.print(num+", ");
			num+=2;
			
		}
	}

}
