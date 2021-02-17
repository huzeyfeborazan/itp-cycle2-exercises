package collections;

import java.util.ArrayList;
import java.util.List;

public class Registration {

	public static void main(String[] args) {
		
		List<String> test = new ArrayList<String>();
		
		test.add("Aziz Degirmenci");
		test.add("Tutku Katirci");
		test.add("Atila Balik");
		test.add("Hamide Bardakci");
		test.add("Fikriye Baris");
		test.add("Ahmet Peynirci");
		test.add("Nihal Aksoy");
		
		List<String> backend = new ArrayList<String>();
		backend.add("Bahtiyar Balik");
		backend.add("Suheyl Katirci");
		backend.add("Irfan Yilmaz");
		backend.add("Ozturk Yilmaz");
		backend.add("Bora Bardakci");
		backend.add("Mehves Kucuk");
		backend.add("Fikri Binici");
		backend.add("Nida Ekmekci");
		
		List<String> frontend = new ArrayList<>();
		frontend.add("Aylin Sadik");
		frontend.add("Munire Solak");
		frontend.add("Berrak Deniz");
		frontend.add("Ali Katirci");
		frontend.add("Muge Solak");
		frontend.add("Sevket Balik");
		frontend.add("Sefa Tilki");
		frontend.add("Selim Terzi");
		frontend.add("Dilsad Kucuk");
		frontend.add("Sirin Macar");
		
		// 1
		List<String> movers = new ArrayList<>();
		movers.add("Aziz Degirmenci");
		movers.add("Tutku Katirci");
		
		test.removeAll(movers);
		backend.addAll(movers);
		
		// 2
		movers.clear();
		movers.add("Ozturk Yilmaz");
		movers.add("Bora Bardakci");
		movers.add("Mehves Kucuk");
		
		backend.removeAll(movers);
		frontend.addAll(movers);
		
		// 3
		movers.clear();
		movers.add("Selim Terzi");
		movers.add("Dilsad Kucuk");
		movers.add("Sirin Macar");
		
		frontend.removeAll(movers);
		test.addAll(movers);
		
		System.out.println("Frontend");
		System.out.println(frontend);
		
		System.out.println("Backend");
		System.out.println(backend);
		
		System.out.println("Test");
		System.out.println(test);

	}

}
