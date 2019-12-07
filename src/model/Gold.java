package model;

public class Gold extends Saving implements Asset{
	private int karat;
	private double weight;
	private double price;
	
	public Gold (int karat, double weight, double price) {
		this.karat = karat;
		this.weight = weight;
		this.price = price;
	}
	
	public int getKarat() {
		return karat;
	}
	
	public void setKarat(int karat) {
		this.karat = karat;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double calculateMonetaryValue() {
		// weight * price per grams
		return this.weight * (this.price * this.karat);
	}
	
	public void deposit(double amount)
	{
		
	}
	
	public void withdraw(double amount)
	{
		
	}
}
