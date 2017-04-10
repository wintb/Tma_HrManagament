

public class Student extends Human{
	
	private double Grade;
	
	
	public Student(String FirstName, String LastName, double Grade){
		super(FirstName, LastName);
		this.Grade = Grade;
	}

	@Override
	public String toString() {
		return "\tFirstName: " + FirstName
				+"\n\tLastName: " + LastName
				+"\n\tGrade: " + Grade;
	}

	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		this.Grade = grade;
	}
	
	

}
