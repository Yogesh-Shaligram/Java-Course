package oops;

class Vehicles{
	
	Vehicles(int noOfWheels){
		wheels=noOfWheels;
	}
	
	Vehicles(int noOfWheels, String vehicleColor){
		wheels=noOfWheels;
		color=vehicleColor;
	}
	
	int wheels;
	String color;
	
	
}

public class Consuructors {
	
	Consuructors(){
		System.out.println("Constructor Working");
	}

	public static void main(String[] args) {
		
		//Consuructors obj1 = new Consuructors();
		
		Vehicles car = new Vehicles(4,"white");
		Vehicles activa = new Vehicles(2);
		System.out.println(car.wheels+" wheels "+car.color+" colour");
		System.out.println(activa.wheels+" wheels");
				

	}
	
}

