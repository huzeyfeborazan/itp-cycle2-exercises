package fitbit;

public class Step implements Exercise {

	@Override
	public int calculateCalories(int duration) {
		return duration * 50;
	}

	@Override
	public String tellWhichPartWasActive() {
		return "Legs";
	}

}
