package fitbit;

public class Swimming implements Exercise {

	@Override
	public int calculateCalories(int duration) {
		return duration * 40;
	}

	@Override
	public String tellWhichPartWasActive() {
		return "Whole Body";
	}

}
