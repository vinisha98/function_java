package com.bridfgelabz.functions;

import java.util.Scanner;

import com.bridfgelabz.utility.Utility2;

public class Sumtozero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the length of the array:");
	      int length = sc.nextInt();
	      int [] myArray = new int[length];
	      System.out.println("Enter the elements of the array:");
	      for(int i=0; i<length; i++ ) {
	    	   myArray[i] = sc.nextInt();
	    	}
	Utility2.Sumtozero(myArray, length);	
	}
}
