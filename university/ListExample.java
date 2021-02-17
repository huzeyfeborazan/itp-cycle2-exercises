package university;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		Student student1 = new Student("2", "Ali");
		Student student2 = new Student("1", "Veli");

		students.add(student1);
		students.add(student2);
		students.add(student1);
		students.add(student2);
		students.add(new Student("3", "Huzeyfe"));
		
		
		System.out.println("All students count: " + students.size());
		System.out.println("All students list: " + students.toString());
		
		students.set(2, new Student("3", "asdasdasd"));

		System.out.println("First student: " + students.get(0));
		System.out.println("Second student: " + students.get(1));
		System.out.println("Third student: " + students.get(2));

	}
		
}
