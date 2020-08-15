package oops;




public class Inheritance {

	public static void main(String[] args) {
		
		
		Teacher t1 = new Teacher();
		
		
		t1.name="Yogesh";
		System.out.println(t1.name);
		t1.walk();
		t1.teach();
		
		Student s1= new Student();
		s1.name="Yogesh";
		
		
		
		Person p1 = t1;				//UpCasting
		
		//Person p1 = new Person();
		
		Teacher t2 = (Teacher)p1;  //DownCasting 
		
		System.out.println(t1 instanceof Person);
		System.out.println(p1 instanceof Teacher);
	}
	
}
	
	
	class Person{
		
		protected String name;
		
		public void walk(){
			System.out.println(name+" is walking");
		}
		
		public void talk() {
			System.out.println(name+" is talking");
		}
	}
	
	
	class Teacher extends Person{
		
		public void teach() {
			System.out.println(name+" is teaching");
			
			}
		
		public void walk() {
			super.walk();
			System.out.println("teacher is walking");
		}
		
	}
	
	
	class Singer extends Person{
		
		public void sing() {
			System.out.println("Singer is singing");
		}
	}
	
	
	
	class Student extends Person{
		
				
	}

