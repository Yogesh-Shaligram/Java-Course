package oops;


class Cat{
	
	boolean hasfur;
	int legs,eyes;
	
	public void description() {
		System.out.println("Cat has "+legs+" legs and " +eyes+" eyes");
	}
	
}



public class Classes {

	public static void main(String[] args) {
		
		Cat cat1=new Cat();
		Cat cat2=new Cat();

		cat1.legs = 4;
		cat1.eyes = 2;
		
		cat2.legs = 3;
		cat2.eyes = 1;
		
		cat1.description();
		cat2.description();
	}

}
