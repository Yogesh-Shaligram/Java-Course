package PracticeProgram;

import java.util.Arrays;

public class MinMaxSum {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5};
		int sum=0;
		int flag=0;
		
		Arrays.parallelSort(a);
		
		for(int i=0;i<4;i++) {
			sum+=a[i];

		}
		System.out.println(sum);
		
		int sum1 = 0;
		for(int i=a.length-1;i>=0;i--) {
			sum1+=a[i];
			flag+=1;
			if(flag==4) {
				break;
			}
		}
		System.out.println(sum1);
		
		
		
		
		
		
		
		
		
	}

}
