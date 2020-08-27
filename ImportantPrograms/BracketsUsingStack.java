package PracticeProgram;
import java.util.*;

public class BracketsUsingStack {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int t= scanner.nextInt();
		boolean isbalance = true;
		scanner.nextLine();
		
		while(t-- !=0) {
			String s = scanner.nextLine();
			Stack<Character> stack = new Stack<>();
			for(int i=0;i<=s.length();i++) {
				char ch = s.charAt(i);
				if(ch=='{'||ch=='('||ch=='[') {
					stack.push(ch);
				}
				if(ch=='}') {
					if(stack.peek()=='}') {
						stack.pop();
					}
					else {
						isbalance = false;
						break;
					}
				}
				if(ch==')') {
					if(stack.peek()==')') {
						stack.pop();
					}
					else {
						isbalance = false;
						break;
					}
				}
				if(ch==']') {
					if(stack.peek()==']') {
						stack.pop();
					}
					else {
						isbalance = false;
						break;
					}
				}
			}
		}
		if(isbalance =true) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not Balanced");
		}
		

	}
	

}
