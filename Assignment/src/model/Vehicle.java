package model;

// Vehicle can be cars and motorcycles

public abstract class Vehicle {
	private String plateNo;
	private String model;
	private double marketValue;
	
	public Vehicle(String plateNo, String model, double marketValue) {
		this.plateNo = plateNo;
		this.model = model;
		this.marketValue = marketValue;
	}
	
	public String getPlateNo() {
		return plateNo;
	}
	
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getMarketValue() {
		return marketValue;
	}
	
	public void setMarketValue(double marketValue) {
		this.marketValue = marketValue;
	}
	
}
