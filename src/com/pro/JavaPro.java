package com.pro;

import java.util.Scanner;

public class JavaPro {

	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		
		int nt = sc.nextInt();
		
		int a,i=0,j=0;
		
		a=nt;
		
		while (a>0) {
			
			i=a%10;
			j=(j*10)+i;
			a=a/10;
			
		}
		System.out.println("The reversed number is::::"+j);
		if (nt==j) {
			System.out.println("Its a palindrome");
			System.out.println("Hurry we done it");
			
		} else {

			System.out.println("No its not a palindrome"); 
		}
		
		
	}

}
