package cput.ac.za;

public abstract class PartTimeEmployee extends Employee implements Payable {
	private int hoursWorked;
	private double hourlyRate;
	
	public PartTimeEmployee(String name, double salary, int hoursWorked, double hourlyRate) {
		super(name, salary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate + "]";
	}

	@Override
	public void calculatePay() {
		double totalSalary = this.getSalary() + (this.getHourlyRate()*this.getHoursWorked());
	}
	
	
	
	
	
	

}
