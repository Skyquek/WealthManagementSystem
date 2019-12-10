 package model;

public class Land extends Property implements Asset{
	private double pricePerM2;
	
	public Land(double area, double pricePerM2) {
		super(area);
		this.pricePerM2 = pricePerM2;
	}

	public double getPricePerM2() {
		return pricePerM2;
	}

	public void setPricePerM2(double pricePerM2) {
		this.pricePerM2 = pricePerM2;
	}
	
	public double calculateMonetaryValue()
	{
		// Area * price per meter squared
		return (super.getArea() * pricePerM2);
	}
}
