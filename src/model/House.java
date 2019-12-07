package model;

public class House extends Property implements Asset{
	private int numOfFloors;
	private String address;
	private double marketValue;
	
	public House(double area, int numOfFloors, String address, double marketValue)
	{
		super(area);
		this.numOfFloors = numOfFloors;
		this.address = address;
		this.marketValue = marketValue;
	}
	
	public int getNumOfFloors() {
		return numOfFloors;
	}
	
	public void setNumOfFloors(int numOfFloors) {
		this.numOfFloors = numOfFloors;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public double getMarketValue() {
		return marketValue;
	}
	
	public void setMarketValue(double marketValue) {
		this.marketValue = marketValue;
	}
	
	public double calculateMonetaryValue() {
		
		// Based on the market value
		return this.marketValue;
	}
}
