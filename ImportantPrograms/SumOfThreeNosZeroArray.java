package PracticeProgram;

import java.util.Arrays;

public class SumOfThreeNosZeroArray {

	public static void main(String[] args) {
		
		int arr[]= {-3,-1,0,4,6,7};
		
		Arrays.sort(arr);
				
		if(solve(arr)==true) {
			//System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
		
		

	}
	
	public static boolean solve(int arr[]) {
		for(int i=0;i<arr.length-2;i++) {
			if(sum(arr,i+1,-arr[i])) {
				System.out.println("3rd No- "+arr[i]);
				return true;
			}
			
		}
		return false;
	}
	
	public static boolean sum(int arr[], int i, int x) {
		
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]+arr[j] > x ) {
				j--;
			}
			
			else if(arr[i]+arr[j]< x) {
				i++;
			}
			else {
				System.out.println("1st No- "+arr[i]);
				System.out.println("2nd No- "+arr[j]);
				return true;
				
			}
		}
		return false;
		
	}

}
