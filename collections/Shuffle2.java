package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Shuffle2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Set<String> colours = new TreeSet<String>();
		String colour = "";
		String answer = "y";
		
		while (answer.equals("y")) {
			System.out.println("Please add a colour");
			colour = scanner.next();
			colours.add(colour);
			System.out.println("Would you like to continue? y=yes, n=no");
			answer = scanner.next();
		}
		
		System.out.println("SORTED");
		System.out.println(colours);

		List<String> colourList = new ArrayList<String>(colours);	
		System.out.println("SHUFFLED");
		Collections.shuffle(colourList);
		System.out.println(colourList);
		
		System.out.println("SHUFFLED v2");
		Collections.shuffle(colourList);
		System.out.println(colourList);
	}

}
