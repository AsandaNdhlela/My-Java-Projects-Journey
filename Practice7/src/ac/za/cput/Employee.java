package ac.za.cput;

public class Employee {
	
	private String title;
	private String firstName;
	private String lastName;
	private String empType;
	
	public Employee(String title, String firstName, String lastName, String empType) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.empType = empType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	@Override
	public String toString() {
		return "Employee [title=" + title + ", firstName=" + firstName + ", lastName=" + lastName + ", empType="
				+ empType + "]";
	}
	
	public void writeToFile() {
		Prac9FileHandler prac9Obj = new Prac9FileHandler();
		prac9Obj.openFile();
		prac9Obj.processFile("Graphic Design#Shelley#Adams#Temporary");
		prac9Obj.closeFile();
	}


}
