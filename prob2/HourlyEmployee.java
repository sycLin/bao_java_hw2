// HourlyEmployee class

public class HourlyEmployee extends Employee {
	private double wage; // wage per hour
	private double hours; // hours worked for week

	// 5-argument constructor
	public HourlyEmployee(String f, String l, String ssn, double hourlyWage, double hoursWorked) {
		super(f, l, ssn);
		setWage(hourlyWage);
		setHours(hoursWorked);
	}

	// set and get wage
	public void setWage(double hourlyWage) {
		if(hourlyWage >= 0.0)
			wage = hourlyWage;
		else
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
	}
	public double getWage() {
		return wage;
	}

	// set and get hours worked
	public void setHours(double h) {
		if(h >= 0.0 && h <= 168.0)
			hours = h;
		else
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
	}
	public double getHours() {
		return hours;
	}

	// calculate earnings
	@Override
	public double earnings() {
		if(getHours() <= 40) {
			// no overtime working
			return getWage() * getHours();
		} else {
			// working overtime
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}

	// return String representation of HourlyEmployee object
	@Override
	public String toString() {
		return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f", super.toString(), "hourly wage", getWage(), "hours worked", getHours());
	}
}