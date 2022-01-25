package com.bridfgelabz.functions;

import java.util.Scanner;

import com.bridfgelabz.utility.Utility2;

public class Windchills {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sacn = new Scanner(System.in);  
		System.out.print("Enter the value of t: ");  
		double t = sacn.nextDouble();  
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter the value of v: ");  
		double v = sn.nextDouble();  
		Utility2.Windchills(t, v);
		    }
	}
