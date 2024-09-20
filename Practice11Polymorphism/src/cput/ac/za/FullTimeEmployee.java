package cput.ac.za;

public abstract class FullTimeEmployee extends Employee implements Payable {
	private double bonus;

	public FullTimeEmployee(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus + salary;
	}

	public double getBonus() {
		return bonus;
	} 

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [bonus=" + bonus + "]";
	}

	@Override
	public void calculatePay() {
		double totalSalary = this.getSalary() + this.getBonus();
 	}
	
	
	

}
