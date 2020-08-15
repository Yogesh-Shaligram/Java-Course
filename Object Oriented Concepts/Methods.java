package oops;

public class Methods {

	public static void main(String[] args) {
		
			int first=22;
			int second=98;
			
			int max=maxOf(first,second);
			System.out.println("Max-"+max);
			
			int min=minOf(first, second);
			System.out.println("Min-"+min);
		
		}
	
	static int maxOf(int a, int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}

	}
	
	static int minOf(int a , int b) {
		return a < b? a:b;
	}

}
