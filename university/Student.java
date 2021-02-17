package university;

public class Student {
	
	Student(String studentNo, String name) {
		this.name = name;
		this.studentNo=studentNo;
	}
	
	private String studentNo;
	private String name;
	
	public String getStudentNo() {
		return studentNo;
	}
	
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentNo == null) ? 0 : studentNo.hashCode());
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
		Student other = (Student) obj;
		if (studentNo == null) {
			if (other.studentNo != null)
				return false;
		} else if (!studentNo.equals(other.studentNo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student" + studentNo + "-" + name;
	}
	
	
	
}
