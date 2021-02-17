package fitbit;

public class Gym implements Exercise {

	@Override
	public int calculateCalories(int duration) {
		return duration * 35;
	}

	@Override
	public String tellWhichPartWasActive() {
		return "Legs and Arms";
	}

}
