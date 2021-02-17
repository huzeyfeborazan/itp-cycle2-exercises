package fitbit;

public class Running implements Exercise {

	private String no;
	
	Running(String no) {
		this.no = no;
	}
	
	Running() {
		
	}
	
	@Override
	public int calculateCalories(int duration) {
		return  duration * 30;
	}

	@Override
	public String tellWhichPartWasActive() {
		return "Legs";
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((no == null) ? 0 : no.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Running other = (Running) obj;
		if (no == null) {
			if (other.no != null)
				return false;
		} else if (!no.equals(other.no))
			return false;
		return true;
	}
	
	

}
