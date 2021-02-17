package weeksix;

import java.util.Stack;

public class StackExample {
	
	public static void main(String[] args) {
	
		Stack<String> stack = new Stack<String>();
		System.out.println(stack.empty());
		stack.add("Apple");
		stack.add("Orange");
		stack.push("Kiwi");
		stack.push("Melon");


		System.out.println(stack);
		
		System.out.println(stack.pop());		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack);		
		System.out.println(stack.empty());
		
		System.out.println(stack.search("Apple"));
		System.out.println(stack.search("Melon"));
		System.out.println(stack.empty());
		
	}

}
