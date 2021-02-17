package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Shuffle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Set<String> colours = new HashSet<String>();
		String colour = "";
		String answer = "y";
		
		while (answer.equals("y")) {
			System.out.println("Please add a colour");
			colour = scanner.next();
			colours.add(colour);
			System.out.println("Would you like to continue? y=yes, n=no");
			answer = scanner.next();
		}
		
		List<String> colourList = new ArrayList<String>(colours);
		System.out.println("SORTED");
		Collections.sort(colourList);
		System.out.println(colourList);
		
		System.out.println("SHUFFLED");
		Collections.shuffle(colourList);
		System.out.println(colourList);
		
		System.out.println("SHUFFLED v2");
		Collections.shuffle(colourList);
		System.out.println(colourList);

		
		
	}

}
