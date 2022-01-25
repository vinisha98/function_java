package com.bridfgelabz.functions;


import java.util.Scanner;

import com.bridfgelabz.utility.Utility2;

public class Twodimearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Utility2 utility = new Utility2();
		int M,N,i=0,j=0;
		Scanner sc=new Scanner(System.in);   
		System.out.print("Enter the number of rows: "); 
		M = sc.nextInt();   
		//utility.M=M;
		System.out.print("Enter the number of columns: "); 
		N = sc.nextInt();   
		//utility.N=N;
		int Array[][] = new int[M][N];   
		System.out.println("Enter the elements of the array: ");   
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				
		Array[i][j] = sc.nextInt();
			}
			}
	Utility2.Twodimearray(M, N, Array);
	
	}
}

