package fitbit;

import java.util.HashSet;
import java.util.Set;

public class CollectionsLesson {

	public static void main(String[] args) {
		
		Set<String> cars = new HashSet<String>();
		cars.add("BMW");
		cars.add("AUDI");
		cars.add("AUDI");
		cars.add("Mercedes");
		cars.add("FIAT");
		
		//System.out.println(cars);
		
		Exercise gym = new Gym();
		Exercise running = new Running("001");
		Exercise running2 = new Running("002");
		Activity sitting = new Sitting();
		
		
		Set<Exercise> morningExercises = new HashSet<Exercise>();
		morningExercises.add(running);
		morningExercises.add(gym);
		
		Set<Exercise> eveningExercises = new HashSet<Exercise>();
		eveningExercises.add(running);
		eveningExercises.add(running);
		eveningExercises.add(running2);
		eveningExercises.add(new Running("002"));
		eveningExercises.add(new Running("002"));
		eveningExercises.add(new Running("002"));
		eveningExercises.add(new Running("002"));
		eveningExercises.add(new Walking());
		eveningExercises.add(new Swimming());
		
		Set<Exercise> exercises = new HashSet<Exercise>();
		exercises.addAll(morningExercises);
		exercises.addAll(eveningExercises);
		
		System.out.println("Morning exercise count: " + morningExercises.size());
		System.out.println("Evening exercise count: " + eveningExercises.size());
		System.out.println("All exercises count: " + exercises.size());
		
		//System.out.println("All exercises: " + exercises.toString());		
		//exercises.remove(running2);
		//exercises.remove(new Running("001"));
		System.out.println("All exercises count: " + exercises.size());
		

		
	}

}
