// PayrollSystemTest testing program for Employee hierarchy

public class PayrollSystemTest {
	public static void main(String[] argv) {
		// create subclass objects
		SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);

		System.out.println("Employees processed individually:\n");
		System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "earned", salariedEmployee.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned", hourlyEmployee.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "earned", commissionEmployee.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

		// create 4-element Employee array
		Employee[] employees = new Employee[4];

		// initialization
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;

		System.out.println("Employees processed polymorphically:\n");
		for(Employee current : employees) {
			// invokes toString()
			System.out.println(current);
			// check if it's a BasePlusCommissionEmployee
			if(current instanceof BasePlusCommissionEmployee) {
				// todo...
				;
			}
			System.out.printf("earned $%,.2f\n\n", current.earnings());
		}
	}
}