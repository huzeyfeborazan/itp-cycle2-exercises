package grocery;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String answer = "Y";
		
		Deque<Grocery> groceryItems = new ArrayDeque<Grocery>();
		
		while (answer.equals("Y")) {
			System.out.println("What is the type of grocery item? F-Fruit : V-Vegetable");
			String type = scanner.next();
			String name = "";
			
			if (type.equals("F")) {
				System.out.println("What is the name of the fruit?");
				name = scanner.next();
				groceryItems.addFirst(new Fruit(name));
			} else if (type.equals("V")) {
				System.out.println("What is the name of the vegetable?");
				name = scanner.next();
				groceryItems.addLast(new Vegetable(name));
			} else {
				System.out.println("Invalid Item!");
			}
			
			System.out.println("Would you like to continue? Y: Yes, N: No");
			answer = scanner.next();
		}
		
		System.out.println(groceryItems);
		System.out.println("Byee...");
		scanner.close();
	}

}
