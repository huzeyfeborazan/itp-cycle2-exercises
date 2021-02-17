package fitbit;

public class Sitting implements Activity {

	@Override
	public int calculateCalories(int duration) {
		return duration * 5;
	}

	@Override
	public String tellWhichPartWasActive() {
		return "Back";
	}

}
