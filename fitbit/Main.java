package fitbit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Fitbit!");
		System.out.println("Please select an activity type:");
		System.out.println("1: Sitting");
		System.out.println("2: Standing");
		System.out.println("3: Walking");
		System.out.println("4: Running");
		System.out.println("5: Gym");
		System.out.println("6: Step");
		System.out.println("7: Swimming");
		
		Scanner scanner = new Scanner(System.in);
		int activity  = scanner.nextInt();
		
		System.out.println("Please enter the duration of activity:");
		int duration = scanner.nextInt();
		
		int calories = 0;
		String bodyText = "";
		
		switch(activity) {
		
		case 1:
			Sitting sitting = new Sitting();
			calories = sitting.calculateCalories(duration);
			bodyText = sitting.tellWhichPartWasActive();
			break;
		case 2:
			Standing standing = new Standing();
			calories = standing.calculateCalories(duration);
			bodyText = standing.tellWhichPartWasActive();
			break;
		case 3:
			Walking walking = new Walking();
			calories = walking.calculateCalories(duration);
			bodyText = walking.tellWhichPartWasActive();
			break;
		case 4:
			// Running
			break;
		case 5:
			// Gym
			break;
		case 6:
			// Step
			break;
		case 7:
			// Swimming
			break;
		default:
			System.out.println("Please select a valid activiy!");
			
		}

		System.out.println("Congratulations, you have burned " + calories + " calories!");
		System.out.println("This activity worked your " + bodyText);

	}

}
