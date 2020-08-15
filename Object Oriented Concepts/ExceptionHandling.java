package oops;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a=5;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}catch(Exception c) {
			System.out.println(c.getMessage()+" Occured");
		}
		
		System.out.println("Exception Handling is working!");
		
		fun();
		
		throw new ArrayIndexOutOfBoundsException("Throw test");
		
		

	}
	
	
	public static void fun() throws ArrayIndexOutOfBoundsException {
		throw new ArrayIndexOutOfBoundsException("Throw test 2!");
	}

}
