package PracticeProgram;

public class BreakingTheRecord {

	public static void main(String[] args) {
		int a[]= {10,5,20,20,4,5,2,25,1};
		
		int high=a[0];
		int low=a[0];
		int hcounter=0;
		int lcounter=0;
		
		for(int i=1;i<a.length;i++) {
			if(a[i]==high) {
				hcounter+=0;
			}
			if(a[i]==low) {
				lcounter+=0;
			}
			if(a[i]>high) {
				hcounter+=1;
				high=a[i];
//				System.out.print(a[i]);
//				System.out.print(hcounter+" ");
				
			}
			else if(a[i]<low) {
				lcounter+=1;
				low=a[i];
			}
		}
		
		System.out.println(hcounter+" "+lcounter);
		
	
	}

}
