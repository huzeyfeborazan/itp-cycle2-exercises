package fitbit;

public class Walking implements Exercise {

	@Override
	public int calculateCalories(int duration) {
		return duration * 20;
	}

	@Override
	public String tellWhichPartWasActive() {
		return "Whole Body and brain and heart";
	}

}
