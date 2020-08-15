package oops;

public class Abstraction {
	
	public static void repair(Vehicle vehicle) {
		System.out.println("Vehicle is Repaired");
	}

	public static void main(String[] args) {
		
		City city=new City();
		Activa activa= new Activa();
		
		repair(city);
		repair(activa);
		
	}

}


abstract class Vehicle{
	
	public abstract void Accelerating();
	public abstract void Braking();
	
	
}

class City extends Vehicle{
	
	public void Accelerating() {
		System.out.println("City is Accelerating");
	}	
	public void Braking() {
		System.out.println("City is Breaking");
	}
	
}

class Activa extends Vehicle{
	
	public void Accelerating() {
		System.out.println("Activa is Accelerating");
	}
	
	public void Braking() {
		System.out.println("Activa is Breaking");
	}
	
}


