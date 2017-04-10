
public class Worker extends Human{
	
	private long WeekSalary;
	private int WorkHoursPerDay;
	
	
	public Worker(String FirstName, String LastName, long WeekSalary, int WorkHoursPerDay){
		super(FirstName, LastName);
		this.WeekSalary = WeekSalary;
		this.WorkHoursPerDay = WorkHoursPerDay;
	}
	
	@Override
	public String toString() {
		return "\tFirstName: " + FirstName
				+"\n\tLastName: " + LastName
				+"\n\tWeekSalary: " + WeekSalary
				+"\n\tWorkHoursPerDay: " + WorkHoursPerDay
				+"\n\tMoneyPerDay: " + MoneyPerHour();
	}
	
	public long MoneyPerHour(){
		return WeekSalary/ (WorkHoursPerDay * 5);
	}
	
	public long getWeekSalary() {
		return WeekSalary;
	}
	public void setWeekSalary(long weekSalary) {
		WeekSalary = weekSalary;
	}
	public int getWorkHoursPerDay() {
		return WorkHoursPerDay;
	}
	public void setWorkHoursPerDay(int workHoursPerDay) {
		WorkHoursPerDay = workHoursPerDay;
	}
	
	

}
