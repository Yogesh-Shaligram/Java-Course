package oops;

public class Interfaces {
	public static void main(String[] args) {
		Person1 obj= new Person1();
		obj.study();
		obj.makeVideo();
		
		
	}

}

class Person1 implements Student1, Youtuber{
	


@Override
public void study() {
	System.out.println("study");
	
}

@Override
public void makeVideo() {
	System.out.println("making Video");
	
}



	
}

interface Student1{
	
	 void study();
	
}


 interface Youtuber{
	
	void makeVideo();
	
}
