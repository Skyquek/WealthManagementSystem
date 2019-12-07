package model;

//Property can be land or house 

public abstract class Property {
	private double area;

	public Property(double area)
	{
		this.area = area;
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
}
