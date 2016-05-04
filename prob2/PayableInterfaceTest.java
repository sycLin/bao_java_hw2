// for testing the interface Payable.

public class PayableInterfaceTest {
	public static void main(String[] argv) {
		// create 6-element Payable array
		Payable[] payableObjects = new Payable[6];

		// populate the array with objects that implement this interface
		payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
		payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
		payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		payableObjects[3] = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
		payableObjects[4] = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
		payableObjects[5] = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);

		System.out.println("Invoices and Employees processed polymorphically:\n");

		// generically process each element in payableObjects
		for(Payable current : payableObjects) {
			// output basic info with toString() invocation
			System.out.printf("%s \n", current.toString());
			// check if it's a BasePlusCommissionEmployee
			if(current instanceof BasePlusCommissionEmployee) {
				// downcasting
				BasePlusCommissionEmployee e = (BasePlusCommissionEmployee) current;
				// increase base salary by 10%
				e.setBaseSalary(1.10 * e.getBaseSalary());
				System.out.printf("new base salary with 10%% increase is: $%,.2f\n", e.getBaseSalary());
			}
			// output current with toString() and output its appropriate payment amount
			System.out.printf("%s: $%,.2f\n\n", "payment due", current.getPaymentAmount());
		}
	}
}