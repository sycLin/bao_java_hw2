// SalariedEmployee

public class SalariedEmployee extends Employee {
	private double weeklySalary;

	// 4-argument constructor
	public SalariedEmployee(String f, String l, String ssn, double salary) {
		super(f, l, ssn);
		setWeeklySalary(salary);
	}

	// set and get weeklySalary
	public void setWeeklySalary(double salary) {
		if(salary >= 0.0)
			weeklySalary = salary;
		else
			throw new IllegalArgumentException("weekly salary must be >= 0.0");
	}
	public double getWeeklySalary() {
		return weeklySalary;
	}

	// calculate earnings
	@Override
	public double earnings() {
		return getWeeklySalary();
	}

	// return String representation of SalariedEmployee object
	@Override
	public String toString() {
		return String.format("salaried employee: %s\n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
	}
}