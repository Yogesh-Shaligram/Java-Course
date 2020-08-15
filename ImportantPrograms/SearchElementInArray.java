package PracticeProgram;

import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
		
		int b[]= {1,2,3,4,5};
		boolean flag=true;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Element to Find: ");
		int find=sc.nextInt();
		
		
		for(int i=0;i<b.length;i++) {
			if(b[i]==find) {
				System.out.println("Element Found!");
				flag=true;
				break;
			}
			else {
				flag=false;
			}
			
		}
		
		if(flag==false) {
			System.out.println("Element Not Found!");
		}
		

	}

}
