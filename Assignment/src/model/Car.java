package model;

public class Car extends Vehicle implements Asset{
	
	public Car(String plateNo, String model, double marketValue) {
		super(plateNo,model,marketValue);
	}
	
	public double calculateMonetaryValue() {
		
		// Based on the market value
		return super.getMarketValue();
	}
}
