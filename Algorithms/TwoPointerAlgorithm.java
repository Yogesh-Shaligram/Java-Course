package Algorithms;

public class TwoPointerAlgorithm {

	public static void main(String[] args) {

		int t[]= {0,1,2,3,4,5,6,7,8};
		
		int i=t[0];
		int j=t.length-1;
		
		int x=15;      //Test case
		
		while(i<j) {
			if(t[i]+t[j] > x ) {
				j--;
			}
			
			else if(t[i]+t[j]< x) {
				i++;
			}
			else {
				System.out.println("Found!");
				System.out.println(" "+t[i]+" "+t[j]);
				break;
			}
		}
		
		
		
	}

}
