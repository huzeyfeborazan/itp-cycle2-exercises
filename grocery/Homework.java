package grocery;

import java.util.HashSet;
import java.util.Set;

public class Homework {

	public static void main(String[] args) {
		
		Set<Grocery> basket = new HashSet<Grocery>();
		basket.add(new Fruit("Apple"));
		basket.add(new Fruit("Fig"));
		basket.add(new Fruit("Orange"));
		basket.add(new Fruit("Banana"));
		basket.add(new Fruit("Apple"));
		basket.add(new Fruit("Apple"));
		
		System.out.println(basket);

	}

}
