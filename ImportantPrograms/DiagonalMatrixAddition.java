package PracticeProgram;

import java.util.*;
import java.math.*;

public class DiagonalMatrixAddition {

	public static void main(String[] args) {
		
		
		
		int[][] a = {
		         { 1, 2, 3 },
		         { 4, 9, 6 },
		         { 7, 8, -9 }
		      };
		int sum =0;
		int sum1 =0;
		int fsum =0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==j) {
					sum+=a[i][j];
				}
				if(i==3-j-1) {
					sum1+=a[i][j];
				}
			}
		}
		fsum=Math.abs(sum-sum1);
		System.out.println(fsum);

	}

}
