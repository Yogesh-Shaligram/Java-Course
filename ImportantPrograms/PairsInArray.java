package PracticeProgram;

public class PairsInArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,20,10,10,30,50,10,20};
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					break;
				}else {
					j++;
					j++;
				}
				System.out.println(count);
			}
		}
		
		System.out.println(count);

	}

}
