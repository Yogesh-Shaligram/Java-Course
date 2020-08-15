package PracticeProgram;

import java.util.Arrays;

public class SumOfTripletsEqualZeroArray {

	public static void main(String[] args) {
		
		int t[]= {5,0,-1,1,3,4};
		
		Arrays.sort(t);
		
		for(int i=0;i<t.length-2;i++) {
			if(sum(-t[i],t,i+1)) {
				System.out.println("Found");
			}
			
			System.out.println("Not Found");
		}
		
		

	}
	
	
	public static boolean sum(int i, int t[], int x) {
		int j=t.length-1;
		
		while(i<j) {
			if(t[i] + t[j] > x) {
				j--;
			}
			else if(t[i] + t[j] < x) {
				i++;
			}
			else {
				return true;
			}
		}
		return false;
		
		
	}

}
