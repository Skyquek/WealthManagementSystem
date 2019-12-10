package controller.manager;

import java.util.Vector;

// Property
import model.Land;
import model.House;

// Vehicle
import model.Car;
import model.Motorcycle;

// Saving
import model.Gold;
import model.BankAccount;

public class AssetManager {
	private static Vector<Land> lands = new Vector<>();
	private static Vector<House> houses = new Vector<>();
	private static Vector<Car> cars = new Vector<>();
	private static Vector<Motorcycle> motorcycles = new Vector<>();
	private static Vector<Gold> golds = new Vector<>();
	private static Vector<BankAccount> bankAccounts = new Vector<>();
		
	// Add to the Vector to contains All 
	public static int addLand(Land land){
		return lands.add(land) ? 1 : 0;
	}
	
	public static int addHouse(House house){
		return houses.add(house) ? 1 : 0;
	}
	
	public static int addCar(Car car){
		return cars.add(car) ? 1 : 0;
	}
	
	public static int addMotorcycle(Motorcycle motorcycle){
		return motorcycles.add(motorcycle) ? 1 : 0;
	}
	
	public static int addGold(Gold gold){
		return golds.add(gold) ? 1 : 0;
	}
	
	public static int addBankAccounts(BankAccount bankAccount){
		return bankAccounts.add(bankAccount) ? 1 : 0;
	}
	
	
	// Check if the Vector is empty, if not then display it. 
	public static Vector<Land> getLands()
	{
		return new Vector<>(lands);
	}
	
	public static Vector<House> getHouses()
	{
		return new Vector<>(houses);
	}
	
	public static Vector<Car> getCars(){
		return new Vector<>(cars);
	}
	
	public static Vector<Motorcycle> getMotorcycles()
	{
		return new Vector<>(motorcycles);
	}
	
	public static Vector<Gold> getGolds()
	{
		return new Vector<>(golds);
	}
	
	public static Vector<BankAccount> getBankAccounts()
	{
		return new Vector<>(bankAccounts);
	}
}
