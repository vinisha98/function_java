package com.bridfgelabz.functions;

import java.util.Scanner;

import com.bridfgelabz.utility.Utility2;  

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sacn = new Scanner(System.in);  
		System.out.print("Enter the value of a: ");  
		double a = sacn.nextDouble();  
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter the value of b: ");  
		double b = sn.nextDouble();  
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of c: ");  
		double c = sc.nextDouble();  
		Utility2.Quadratic(a,b,c);
	}
}