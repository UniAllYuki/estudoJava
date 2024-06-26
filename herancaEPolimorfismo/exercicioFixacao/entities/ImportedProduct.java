package entities;

public class ImportedProduct extends Product{

	private double customsFee;
	
	public ImportedProduct() {
	}

	public ImportedProduct(String name, Double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public final String priceTag() {
		return name + " US$" + String.format("%.2f", totalPrice()) + " (CustomsFee: US$" + String.format("%.2f)", customsFee);
	}
	
}
