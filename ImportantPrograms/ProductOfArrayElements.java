package PracticeProgram;

public class ProductOfArrayElements {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8};
		int mul=a[0];
		
		for(int i=1;i<a.length;i++) {
			mul=mul*a[i];
		}
		
		System.out.println(mul);
		
	}

}
