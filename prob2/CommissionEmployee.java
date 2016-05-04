// CommissionEmployee class

public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;

	// 5-argument constructor
	public CommissionEmployee(String f, String l, String ssn, double sales, double rate) {
		super(f, l, ssn);
		setGrossSales(sales);
		setCommissionRate(rate);
	}

	// set and get grossSales
	public void setGrossSales(double sales) {
		if(sales >= 0.0)
			grossSales = sales;
		else
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
	}
	public double getGrossSales() {
		return grossSales;
	}

	// set and get commissionRate
	public void setCommissionRate(double rate) {
		if(rate > 0.0 && rate < 1.0)
			commissionRate = rate;
		else
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
	}
	public double getCommissionRate() {
		return commissionRate;
	}

	// calculate earnings
	@Override
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}

	// return String representation of CommissionEmployee object
	@Override
	public String toString() {
		return String.format("%s: %s\n%s: $%,.2f; %s: %.2f", "commission employee", super.toString(), "gross sales", getGrossSales(), "commission rate", getCommissionRate());
	}
}