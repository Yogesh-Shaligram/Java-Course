package PracticeProgram;

import java.util.Arrays;

public class CandyDistributionByRating {

	public static void main(String[] args) {
		int a[]= {8,2,4,3,5,2,2,6,4,5};
		int[] c = new int[10];
		
		Arrays.fill(c,1);
		
		
		for(int i=1;i<a.length-1;i++) {
				if(a[i]>a[i-1]) {
					c[i]=c[i]+1;
				}
			}
		
//		for(int i=0;i<c.length;i++) {
//			System.out.print(" "+c[i]);
//		}
		
		for(int i=a.length-2;i>=0;i--) {
			if(a[i]>a[i+1]) {
				c[i]=Math.max(c[i+1]+1, c[i]);
			}
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.print(" "+c[i]);
		}
		
		System.out.println();
		int sum=0;
		for(int i=0;i<c.length;i++) {
			sum=sum+c[i];
		}
		System.out.println(sum);
		
		

	}

}
