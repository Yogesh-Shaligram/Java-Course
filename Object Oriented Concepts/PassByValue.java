package oops;

class Dog{
	int legs;
}

public class PassByValue {
	
	public static void main(String[] args) {
		int a = 34;
		int b = 22;
		
		swap(34, 22);
		
		System.out.println("MainMethod"+" a= "+a+" b= "+b);
		
		
		
		Dog e = new Dog();
		e.legs = 4;
		
		Dog f = new Dog();
		f.legs = 3;
		
		swap(e.legs,f.legs);
		System.out.println("SwapMethod"+" 1= "+e.legs+" 2= "+f.legs);

	}
	
	static void swap(int c, int d) {
		int temp=c;
		c=d;
		d=temp;
		
		System.out.println("MainMethod"+" 1= "+c+" 2= "+d);
	}
	
	static void swap(Dog a, Dog b) {
		Dog temp=a;
		a=b;
		b=temp;
		System.out.println("SwapMethod"+" a= "+a+" b= "+b);
	}
	

}



