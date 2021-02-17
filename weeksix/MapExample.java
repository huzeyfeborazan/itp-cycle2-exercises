package weeksix;

import java.util.HashMap;
import java.util.Iterator;

public class MapExample {
	
	public static void main(String[] args) {
		
		// Map -> Key, Value
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("GB", "Britain");
		map.put("GB1", "Britain");
		map.put("DE", "Germany");
		map.put("NL", "Netherlands");
		
//		System.out.println(map);
//		System.out.println(map.get("NL"));
//		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.putIfAbsent("GB", "Britain");
		map2.putIfAbsent("GB1", "Britain");
		map2.putIfAbsent("DE", "Germany");
		map2.putIfAbsent("GB", "asdadasda");
		System.out.println(map2);
		
		Iterator<String> mapIterator = map2.values().iterator();
		
		while(mapIterator.hasNext()) {
			System.out.println("Value: " + mapIterator.next());
		}
		
		Iterator<String> keyIterator = map2.keySet().iterator();
		while(keyIterator.hasNext()) {
			System.out.println("Key: " + keyIterator.next());
		}
		
		String[] balances = {
				"1,100",
				"2,150",
				"3,200",
				"4,100",
				"5,150",
				"1,125",
				"3,150"
		};
		
		String[] names = {
				"1,Mehmet",
				"2,Ali",
				"3,Huzeyfe",
				"4,Veli",
				"5,Mark",
				"1,Memo",
				"3,Huzi"
		};
		
		
		
	}
		

}
