package com.company;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Rows");
		int row=scanner.nextInt();
		System.out.println("Enter Clos");
		int cols=scanner.nextInt();
		
		int a[][]=new int[row][cols];
		int b[][]=new int[row][cols];
		
		
		System.out.println("Enter array A");
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				a[i][j]=scanner.nextInt();
			}
		}
		
		System.out.println("Enter array B");
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				b[i][j]=scanner.nextInt();
			}
		}
		
		int c[][]=new int[row][cols];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		//System.out.println("Array A");
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(" + ");
		
		//System.out.println("Array B");
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(" = ");
		
		//System.out.println("Array C");
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
