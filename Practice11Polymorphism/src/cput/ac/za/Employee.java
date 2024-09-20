package cput.ac.za;

public abstract class Employee {
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
	
	public abstract void pay();
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}
