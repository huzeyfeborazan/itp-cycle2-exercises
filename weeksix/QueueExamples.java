package weeksix;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<String>();
		q.add("Apple");
		q.add("Orange");
		q.add("Kiwi");
				
		System.out.println("Size: " + q.size());
		System.out.println(q);
		System.out.println("Next element: " + q.poll());
		System.out.println("Size: " + q.size());
		System.out.println(q);
		System.out.println("Next element: " + q.peek());
		System.out.println("Size: " + q.size());
		System.out.println(q);
		q.remove();
		System.out.println(q);
		System.out.println("Size: " + q.size());
		
		System.out.println("--- DEQUE ---");

		
		Deque<String> d = new ArrayDeque<String>();
		d.add("Apple");
		d.addFirst("Orange");
		d.addLast("Pineapple");
		d.add("Kiwi");
		
		System.out.println("Size: " + d.size());
		System.out.println(d);
		System.out.println("Poll Last element: " + d.pollLast());
		System.out.println(d);
		System.out.println("Size: " + d.size());
		System.out.println("Peek Next element: " + d.peekLast());
		System.out.println(d);
		System.out.println("Size: " + d.size());
		System.out.println(d);
		d.removeLast();
		System.out.println(d);
		d.remove();
		System.out.println(d);
		System.out.println("Size: " + d.size());
		System.out.println(d);

	}

}
