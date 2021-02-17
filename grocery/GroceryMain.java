package grocery;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroceryMain {

	public static void main(String[] args) {
		
		List<Grocery> basket = new ArrayList<Grocery>();
		basket.add(new Fruit("Apple"));
		basket.add(new Fruit("Fig"));
		basket.add(new Fruit("Orange"));
		basket.add(new Fruit("Banana"));
		basket.add(new Fruit("Mango"));
		basket.add(new Fruit("Pineapple"));
		basket.add(new Vegetable("Leeks"));
		basket.add(new Vegetable("Potatoes"));
		basket.add(new Vegetable("Tomatoes"));
		basket.add(new Vegetable("Spinach"));
		basket.add(new Vegetable("Kale"));
		basket.add(new Vegetable("Swede"));
		basket.add(new Vegetable("Broccoli"));
		basket.add(new Vegetable("Cauliflower"));
		
		int vegetableCount = 0;
		int fruitCount = 0;
		
		Iterator<Grocery> it = basket.iterator();
		while (it.hasNext()) {
			Grocery item = it.next();
			if (item instanceof Fruit) {
				fruitCount++;
			} else if (item instanceof Vegetable) {
				vegetableCount++;
			}
		}
	
		// 7
		System.out.println("There are " + basket.size() + " item(s) in the basket. "
				+ "You added " + fruitCount +  " fruit(s) and " +  vegetableCount + " vegetable(s).");

		// 8
		System.out.println("Did you buy Banana? " + basket.contains(new Fruit("Banana")));
		System.out.println("Did you buy Leeks? " + basket.contains(new Vegetable("Leeks")));

		
		
		
		
	
	}

}
