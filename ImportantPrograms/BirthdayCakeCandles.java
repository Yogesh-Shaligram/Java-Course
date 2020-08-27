package PracticeProgram;

import java.util.Arrays;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		int a[]= {3,2,1,3,3};
		long sum=1;
		
		Arrays.parallelSort(a);
		
		for(int i=a.length-1;i>0;i--) {
			if(a[i]==a[i-1]) {
				sum+=1;
			}
		}
		System.out.println(sum);

		
	}

}
