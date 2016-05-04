// Employee abstract superclass

public abstract class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	// 3-argument constructor
	public Employee(String f, String l, String ssn) {
		firstName = f;
		lastName = l;
		socialSecurityNumber = ssn;
	}

	// set and get of firstName
	public void setFirstName(String f) {
		firstName = f;
	}
	public String getFirstName() {
		return firstName;
	}

	// set and get of lastName
	public void setLastName(String l) {
		lastName = l;
	}
	public String getLastName() {
		return lastName;
	}

	// set and get of socialSecurityNumber
	public void setSocialSecurityNumber(String ssn) {
		socialSecurityNumber = ssn;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	// return String representation of Employee object
	@Override
	public String toString() {
		return String.format("%s %s\nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
	}

	// abstract method to be overridden
	public abstract double earnings();
}