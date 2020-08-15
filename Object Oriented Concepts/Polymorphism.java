package oops;

public class Polymorphism {

	public static void main(String[] args) {
		
		
		BDog d=new BDog();
		Pet p=d;
		Animal a=d;
		
		//p=d;
		d.walk();
		p.walk();

	}

}




class Animal{
	
}

class Pet extends Animal{
	
	static void walk() {
		System.out.println("Pet is walking");
	}
	
}

class BDog extends Pet{
	
	static void walk() {
		System.out.println("Dog is walking");
	}
	
}

