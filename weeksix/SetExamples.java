package weeksix;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
	
	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("Apple");
		hashSet.add("Pear");
		hashSet.add("Orange");
		hashSet.add("Pineapple");
		hashSet.add("Kiwi");	
		System.out.println(hashSet);

		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Apple");
		linkedHashSet.add("Pear");
		linkedHashSet.add("Pineapple");
		linkedHashSet.add("Orange");
		linkedHashSet.add("Kiwi");
		System.out.println(linkedHashSet);
		
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Tangerine");
		treeSet.add("Apple");
		treeSet.add("Pear");
		treeSet.add("Pineapple");
		treeSet.add("Orange");
		treeSet.add("Kiwi");
		System.out.println(treeSet);
		
	}

}
