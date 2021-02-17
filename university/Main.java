package university;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Student stu1 = new Student("100", "Ali Tuzcu");
		
		Set<Student> allStudents = new HashSet<Student>();
		allStudents.add(stu1);
		System.out.println(stu1.toString());
		allStudents.add(new Student("102", "Veli Deli"));
		allStudents.add(new Student("103", "George Washington"));
		allStudents.add(new Student("104", "Mahmut"));
		allStudents.add(new Student("105", "Tufan"));
		allStudents.add(new Student("106", "Sule"));
		allStudents.add(new Student("107", "Elif"));
		allStudents.add(new Student("108", "Nurcan"));
		allStudents.add(new Student("109", "Nurcan"));
		allStudents.add(new Student("110", "Nurcan"));
		allStudents.add(new Student("111", "Nurcan"));
		allStudents.add(new Student("121", "Nurcan"));
		allStudents.add(new Student("122", "Nurcan"));
		allStudents.add(new Student("122", "Nurcan"));
		allStudents.add(new Student("123", "Nurcan"));
		
		
		Set<Student> frontend = new HashSet<Student>();
		frontend.add(new Student("200", "Ali"));
		frontend.add(new Student("200", "Mehmet"));
		frontend.add(new Student("200", "Ayse"));
		
		Set<Student> test = new HashSet<Student>();
		test.add(new Student("105", "Tufan"));
		test.add(new Student("106", "Sule"));
		test.add(new Student("107", "Elif"));
		test.add(new Student("108", "Nurcan Hanim"));
		test.add(new Student("110", "Nurcan Hanim"));
		
		System.out.println("All students count: " + allStudents.size());
		System.out.println("All students list: " + allStudents.toString());
		System.out.println("Front end: " + frontend.size());
		System.out.println("Test: " + test.size());
		
		System.out.println("Is all fronted registered: " + allStudents.containsAll(frontend));
		System.out.println("Is all TEST registered: " + allStudents.containsAll(test));
		
//		Set<Student> failedStudents = new HashSet<Student>();
//		failedStudents.add(stu1);
//		failedStudents.add(new Student("102", "Veli Deli"));
//		failedStudents.add(new Student("103", "George Washington"));
//		
//		allStudents.removeAll(failedStudents);
//		
		
//		allStudents.retainAll(test);
//		allStudents.retainAll(frontend);
		
		allStudents.clear();
		
		System.out.println("All students count: " + allStudents.size());
		System.out.println("All students list: " + allStudents.toString());
	}

}
