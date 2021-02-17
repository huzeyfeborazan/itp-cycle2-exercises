package weeksix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListsExample {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>();	
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Lemon");
		fruits.add("Pineapple");
		fruits.add("Banana");
		
		Iterator<String> iterator = fruits.iterator();
//		System.out.println(iterator.hasNext() + " " + iterator.next());
//		//iterator.next();
//		//iterator.remove();
//		System.out.println(iterator.hasNext() + " " + iterator.next());
//		//iterator.next();
//		//iterator.remove();
//		System.out.println(iterator.hasNext() + " " + iterator.next());
//		//iterator.next();
//		//iterator.remove();
//		System.out.println(iterator.hasNext() + " " + iterator.next());
//		//iterator.remove();
//		System.out.println(iterator.hasNext());
//		System.out.println(fruits);
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}
		
		System.out.println(fruits);

		
		
//		System.out.println("Is there a banana? = " + fruits.contains("Banana"));
//		System.out.println("Where is the banana? = " + fruits.indexOf("Banana"));
//		fruits.remove(4);
//		System.out.println("Is there a banana? = " + fruits.contains("Banana"));
//		System.out.println("Is there a mango? = " + fruits.contains("Mango"));
//		
//		
//		Collections.sort(fruits);
//		
//		// Java 8 dersinde anlatilacak
//		fruits.iterator().forEachRemaining(System.out::println);
//		
//		System.out.println("Everyday I am shuffling-----");
//		Collections.shuffle(fruits);
//		fruits.iterator().forEachRemaining(System.out::println);
//
//		System.out.println("Everyday I am shuffling------");
//		Collections.shuffle(fruits);
//		fruits.iterator().forEachRemaining(System.out::println);
//		
//		System.out.println("Sorting------");
//		Collections.sort(fruits);
//		fruits.iterator().forEachRemaining(System.out::println);
//		
//		System.out.println("Reversing-----");
//		Collections.reverse(fruits);
//		fruits.iterator().forEachRemaining(System.out::println);
	}

}
