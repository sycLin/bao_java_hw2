// Invoice class that implements Payable

public class Invoice implements Payable {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	// 4-argument constructor
	public Invoice(String part, String des, int count, double price) {
		partNumber = part;
		partDescription = des;
		setQuantity(count);
		setPricePerItem(price);
	}

	// set and get number
	public void setPartNumer(String part) {
		partNumber = part;
	}
	public String getPartNumber() {
		return partNumber;
	}

	// set and get description
	public void setPartDescription(String des) {
		partDescription = des;
	}
	public String getPartDescription() {
		return partDescription;
	}

	// set and get quantity
	public void setQuantity(int count) {
		if(count >= 0)
			quantity = count;
		else
			throw new IllegalArgumentException("Quantity must be >= 0");
	}
	public int getQuantity() {
		return quantity;
	}

	// set and get price per item
	public void setPricePerItem(double price) {
		if(price >= 0.0)
			pricePerItem = price;
		else
			throw new IllegalArgumentException("Price per item must be >= 0.0");
	}
	public double getPricePerItem() {
		return pricePerItem;
	}

	// return String representation of an object
	@Override
	public String toString() {
		return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", "invoice", "part number", getPartNumber(), getPartDescription(), "quantity", getQuantity(), "price per item", getPricePerItem());
	}

	// to carry out contract with interface Payable
	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem();
	}
}