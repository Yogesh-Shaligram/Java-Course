package PracticeProgram;

public class PrintAlternateNosFromArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8};
		
		System.out.print(arr[0]);
		for(int i=1;i<arr.length-1;i++) {
			i++;
			System.out.print(" "+arr[i]);
		}
	}

}
