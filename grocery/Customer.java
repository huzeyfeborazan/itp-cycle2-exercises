package grocery;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer {

	public static void main(String[] args) {
		String[] balances = {
			"1,100",
			"2,150",
			"3,200",
			"4,100",
			"5,150",
			"1,125",
			"3,150"
		};
		
		Map<String, String> balanceMap = new HashMap<String, String>();
		
		for (String line: balances) {
			List<String> balanceSplit = Arrays.asList(line.split(","));
			String customerNo = balanceSplit.get(0);
			String balance = balanceSplit.get(1);
			balanceMap.put(customerNo, balance);
		}
		
		System.out.println(balanceMap);
		
		String[] names = {
			"1,Mehmet",
			"2,Ali",
			"3,Huzeyfe",
			"4,Veli",
			"5,Mert",
			"1,Memo",
			"3,Huzi"
		};
		
		Map<String, String> namesMap = new HashMap<String, String>();
		
		for (String line: names) {
			List<String> namesSplit = Arrays.asList(line.split(","));
			String customerNo = namesSplit.get(0);
			String name = namesSplit.get(1);
			namesMap.putIfAbsent(customerNo, name);
		}
		
		System.out.println(namesMap);

	}

}
