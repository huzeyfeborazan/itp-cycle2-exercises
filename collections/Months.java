package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Months {
	
	
	public static void main(String[] args) {
		
		String[] months = {
			"January", 
			"February",
			"March",
			"April", 
			"May",
			"June",
			"July",
			"August",
			"September",
			"October",
			"November",
			"December"
		};
		
		// 1
		System.out.println("--- PRINT AS LIST ---");
		List<String> monthList = Arrays.asList(months);
		System.out.println(monthList);
		
		// 2
		System.out.println("--- SORTED ---");
		Collections.sort(monthList);
		System.out.println(monthList);
		
		// 3
		System.out.println("--- SHUFFLED ---");
		Collections.shuffle(monthList);
		System.out.println(monthList);
		
		// 4
		System.out.println("--- MONTHS WITH J ---");
		// 4.1
		System.out.println("--- 4.1 ---");
		Iterator iterator = monthList.iterator();
		while(iterator.hasNext()) {
			String month = iterator.next().toString();
			if (month.startsWith("J")) {
				System.out.println(month + " ");
			}
		}
		
		// 4.2
		System.out.println("--- 4.2 ---");
		for(int i=0; i<monthList.size(); i++) {
			if(monthList.get(i).contains("J")) {
				System.out.println(monthList.get(i) + " ");
			}
		}
		
		System.out.println("--- 4.3 ---");
		iterator = monthList.iterator();
		while(iterator.hasNext()) {
			String month = iterator.next().toString();
			if (month.substring(0, 1).equals("J")) {
				System.out.println(month + " ");
			}
		}

			
	}
	
	

}
