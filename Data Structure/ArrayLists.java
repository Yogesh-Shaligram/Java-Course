package DataStructure;

import java.util.*;

public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList fruits = new ArrayList();
		
		List<String> vegetables = new ArrayList();
		
		fruits.add("Apple");
		fruits.add("Orange");
		
		vegetables.add("Tomatoes");
		vegetables.add("Potatoes");
		
		fruits.addAll(vegetables);
		
		fruits.remove(1);
		
		System.out.println(fruits.get(1));
		System.out.println(fruits);
		
		vegetables.set(1, "Brocoli");
		
		
		
		System.out.println(vegetables);
		
		
		Pair<Integer, String> obj1 = new Pair("Yogesh", 22);
		Pair<Boolean, Long> obj2 = new Pair(true, 3456788);
		obj1.print();
		obj2.print();
		
	}

}


class Pair<X,Y>{
	
	X x;
	Y y;
	
	public Pair(X x, Y y) {
		this.x=x;
		this.y=y;
	}
	
	public  void print() {
		System.out.println(x+" "+y);
	}
	
	
}
