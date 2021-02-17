package fitbit;

public class Standing implements Activity {

	@Override
	public int calculateCalories(int duration) {
		return duration * 10;
	}

	@Override
	public String tellWhichPartWasActive() {
		return "Legs";
	}

}
