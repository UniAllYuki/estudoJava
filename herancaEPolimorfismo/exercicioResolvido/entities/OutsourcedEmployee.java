package entities;

public class OutsourcedEmployee extends Employee {

	private double additionalCharge;
	
	public OutsourcedEmployee() {
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public final Double payment() {
		return super.payment() + (1.1 * additionalCharge); 
	}
	
	
}
