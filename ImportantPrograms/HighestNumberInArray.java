package com.company;

public class HighestNumberInArray {

	public static void main(String[] args) {
		
		int r[]={2,4,6,9,12,8,23,45,9};
				
		int max=r[0];
		for(int i=0;i<r.length;i++) {
			if(r[i]>max) {
				max=r[i];
			}
		}
		
		System.out.println(max);
	}

}
