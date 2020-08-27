package PracticeProgram;

import java.util.*;

public class GradingStudents {

	public static void main(String[] args) {
		int m[]= {11,33,39,55,43,44,67,38,81,89};
		int fm[]=new int[m.length];
	
		for(int i=0;i<m.length;i++) {
			if(m[i]>35) {
				if(m[i]%5==0) {
					fm[i]=m[i];
				}
				else if(m[i]%5==3) {
					
						fm[i]=m[i]+2;
				}
				else if(m[i]%5==4) {
						fm[i]=m[i]+1;
				}
				else if(m[i]%5==1 || m[i]%5==2) {
						fm[i]=m[i];
				}
							
			}
			else {
				fm[i]=m[i];
				
			}
		}
		
		for(int i=0;i<fm.length;i++) {
			System.out.print(" "+fm[i]);
		}
		
		List<Integer> ffm = new ArrayList<>();
		
		for(int i=0;i<fm.length;i++) {
			ffm.add(fm[i]);
		}
		System.out.println();
		System.out.println(ffm);
		
	}
}
