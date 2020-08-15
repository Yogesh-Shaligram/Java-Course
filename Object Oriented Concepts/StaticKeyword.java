package oops;

import oops.A.B;
import oops.A.C;

public class StaticKeyword {

	public static void main(String[] args) {
		
		
		 
		
		A objA = new A();
		B objB = objA.new B();			//B class object requires A class object
		
		C objC = new A.C();				//C class object dosn't requires A class object
		
		System.out.println(objC.name);
		
	}

}


class A{
	
	class B{
		
		
	}
	
	static class C{							//static class
		
		static String name ="Yogesh";		//static variable
	
		static {							//static block Executes before main
			System.out.println("Hello");
		}
	}
}
