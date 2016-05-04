// BasePlusCommissionEmployee class

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;

	// 6-argument constructor
	public BasePlusCommissionEmployee(String f, String l, String ssn, double sales, double rate, double salary) {
		super(f, l, ssn, sales, rate);
		setBaseSalary(salary);
	}

	// set and get base salary
	public void setBaseSalary(double salary) {
		if(salary >= 0.0)
			baseSalary = salary;
		else
			throw new IllegalArgumentException("Base salary must be >= 0.0");
	}
	public double getBaseSalary() {
		return baseSalary;
	}

	// calculate earnings
	@Override
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}

	// return String representation of BasePlusCommissionEmployee object
	@Override
	public String toString() {
		return String.format("%s %s; %s: $%,.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
	}
}
