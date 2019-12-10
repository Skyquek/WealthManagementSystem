package view;

import java.util.Scanner;
import java.util.Vector;

import controller.manager.AssetManager;
import controller.validator.InvalidNumberException;
import controller.validator.MinimumNumberException;
import controller.validator.Validator;
import model.Car;
import model.House;
import model.Land;
import model.Motorcycle;
import model.Gold;
import model.BankAccount;


public class AssetView extends View{
	public void displayOptions() {
		
		// I prefer to separate out between 7 and 8 because I think Its more flexible liek this
		System.out.println("Manage Asset");
		System.out.println("--------------------------------------------");
		System.out.println("1 \t Add Land");
		System.out.println("2 \t Add House");
		System.out.println("3 \t Add Car");
		System.out.println("4 \t Add Motorcycle");
		System.out.println("5 \t Add Gold");
		System.out.println("6 \t Add Bank Account Money");
		System.out.println("7 \t Display All Assets");
		System.out.println("8 \t Display Total Asset Value");
		System.out.println("0 \t Back to main menu");
	}

	public void processOption(Scanner scanner, int choice) {
		Vector<Exception> exceptions = new Vector<>();
		
		if(choice == 1) 
		{
			scanner.nextLine();

			System.out.println("Please enter the land details: ");
			System.out.println("Area of the Land: ");
			String landAreaRaw = scanner.nextLine();
			System.out.println("Price Per Meter Squared: ");
			String landPriceM2Raw = scanner.nextLine();
			
			try {
					
				// Check user Input to make sure user not input negative number (Answer Question)
				Validator.validate(landAreaRaw, landPriceM2Raw, true);
				
				double landArea = Double.parseDouble(landAreaRaw);
				double landPriceM2 = Double.parseDouble(landPriceM2Raw);
				
				Land land = new Land(landArea,landPriceM2);
				if(AssetManager.addLand(land) != 0)
				{
					System.out.println("Succesfull added a new land.");
				} 
				else 
				{
					System.err.println("Unable to add a new land.");
				}
				
			}catch (MinimumNumberException| InvalidNumberException e){
				System.out.println(e.getMessage());
				exceptions.add(e);
			}
			
		}
		else if (choice == 2) 
		{
			scanner.nextLine();

			System.out.println("Please enter the House details: ");
			System.out.println("Area of the House: ");
			String houseAreaRaw = scanner.nextLine();
			
			System.out.println("Number of floor: ");
			String numOfFloorRaw = scanner.nextLine();
			
			System.out.println("Address of the house: ");
			String address = scanner.nextLine();
			
			System.out.println("Market Value of the house: ");
			String houseMarketValueRaw = scanner.nextLine();
			
			try {
				
				// Check user Input
				Validator.validate(houseAreaRaw,numOfFloorRaw,houseMarketValueRaw, true);
				
				double houseArea = Double.parseDouble(houseAreaRaw);
				double houseMarketValue = Double.parseDouble(houseMarketValueRaw);
				int numOfFloor = Integer.parseInt(numOfFloorRaw);
				
				House house = new House(houseArea,numOfFloor,address,houseMarketValue);
				
				if(AssetManager.addHouse(house) != 0)
				{
					System.out.println("Succesfull added a new House.");
				} 
				else 
				{
					System.err.println("Unable to add a new House.");
				}
				
			}catch (MinimumNumberException| InvalidNumberException e){
				System.out.println(e.getMessage());
				exceptions.add(e);
			}	
		}
		else if (choice == 3) 
		{
			scanner.nextLine();

			System.out.println("Please enter the Car details: ");
			
			System.out.println("Car Plate No: ");
			String carPlateNo = scanner.nextLine();
			
			System.out.println("Car Model: ");
			String carModel = scanner.nextLine();
			
			System.out.println("Car Market Value: ");
			String carMarketValueRaw = scanner.nextLine();
			
			try {
				
				// Check user Input to make sure user not input negative number (Answer Question)
				Validator.validate(carMarketValueRaw, true);
				
				double carMarketValue = Double.parseDouble(carMarketValueRaw);
				Car car = new Car(carPlateNo,carModel,carMarketValue);
				
				if(AssetManager.addCar(car) != 0)
				{
					System.out.println("Succesfull added a new Car.");
				} 
				else 
				{
					System.err.println("Unable to add a new Car.");
				}
				
			}catch (MinimumNumberException|InvalidNumberException e){
				System.out.println(e.getMessage());
				exceptions.add(e);
			}				
		}
		else if (choice == 4) 
		{
			scanner.nextLine();

			System.out.println("Please enter the Motorcycle details: ");
			
			System.out.println("Motorcycle Plate No: ");
			String motorcyclePlateNo = scanner.nextLine();
			
			System.out.println("Motorcycle Model: ");
			String motorcycleModel = scanner.nextLine();
			
			System.out.println("Motorcycle Market Value: ");
			String motorcycleMarketValueRaw = scanner.nextLine();
			
			try {
				
				// Check user Input to make sure user not input negative number (Answer Question)
				Validator.validate(motorcycleMarketValueRaw, true);
				
				double motorcycleMarketValue = Double.parseDouble(motorcycleMarketValueRaw);
				Motorcycle motorcycle = new Motorcycle(motorcyclePlateNo,motorcycleModel,motorcycleMarketValue);
				
				if(AssetManager.addMotorcycle(motorcycle) != 0)
				{
					System.out.println("Succesfull added a new Motorcycle.");
				} 
				else 
				{
					System.err.println("Unable to add a new Motorcycle.");
				}
				
			}catch (MinimumNumberException|InvalidNumberException e){
				System.out.println(e.getMessage());
				exceptions.add(e);
			}	

		}
		else if (choice == 5) 
		{
			scanner.nextLine();

			System.out.println("Please enter the Gold details: ");
			
			System.out.println("Gold's Karat: ");
			String karatRaw = scanner.nextLine();
			
			System.out.println("Gold's Weight: ");
			String weightRaw = scanner.nextLine();
			
			System.out.println("Gold's Price: ");
			String priceRaw = scanner.nextLine();
			
			try {
				
				// Check user Input to make sure user not input negative number (Answer Question)
				Validator.validate(karatRaw, weightRaw, priceRaw, true);
				
				int karat = Integer.parseInt(karatRaw);
				double weight = Double.parseDouble(weightRaw);
				double price = Double.parseDouble(priceRaw);
				
				Gold gold = new Gold(karat,weight,price);
				
				if(AssetManager.addGold(gold) != 0)
				{
					System.out.println("Succesfull added a new Gold.");
				} 
				else 
				{
					System.err.println("Unable to add a new Gold.");
				}
				
			}catch (MinimumNumberException|InvalidNumberException e){
				System.out.println(e.getMessage());
				exceptions.add(e);
			}	
		}
		else if (choice == 6) 
		{
			scanner.nextLine();

			System.out.println("Please enter the Bank Account details: ");
			
			System.out.println("Bank Account No: ");
			String accountNo = scanner.nextLine();
			
			System.out.println("Bank Account Name: ");
			String bankName = scanner.nextLine();
			
			System.out.println("Bank Account Balance: ");
			String balanceRaw = scanner.nextLine();
			
			System.out.println("Bank Account Interest Rate: ");
			String interestRateRaw = scanner.nextLine();
			
			try {
				
				// Check user Input to make sure user not input negative number (Answer Question)
				Validator.validate(balanceRaw, interestRateRaw, true);
				
				double balance = Double.parseDouble(balanceRaw);
				double interestRate = Double.parseDouble(interestRateRaw);
				
				BankAccount bankAccount = new BankAccount(accountNo,bankName,balance,interestRate);
				
				if(AssetManager.addBankAccounts(bankAccount) != 0)
				{
					System.out.println("Succesfull added a new Bank Account.");
				} 
				else 
				{
					System.err.println("Unable to add a new Bank Account.");
				}
				
			}catch (MinimumNumberException|InvalidNumberException e){
				System.out.println(e.getMessage());
				exceptions.add(e);
			}		
		}
		else if (choice == 7)
		{	
			Vector<Land> lands = AssetManager.getLands();
			Vector<House> houses = AssetManager.getHouses();
			Vector<Car> cars = AssetManager.getCars();
			Vector<Motorcycle> motorcycles = AssetManager.getMotorcycles();
			Vector<Gold> golds = AssetManager.getGolds();
			Vector<BankAccount> bankAccounts = AssetManager.getBankAccounts();
			
			// Just a line separator <hr></hr>
			System.out.println("*********************************************************************");
						
			if(lands.isEmpty() == false)
			{
				System.out.println("Land Owned");
				System.out.println("--------------------------------");
				int index = 1;
				for(Land land : lands)
				{
					System.out.println("Land " + index + " details:");
					displayLand(land);
					index++;
				}
			}
			
			if(houses.isEmpty() == false)
			{
				System.out.println("House Owned");
				System.out.println("--------------------------------");
				int index = 1;
				for(House house : houses)
				{
					System.out.println("House " + index + " details:");
					displayHouse(house);
					index++;
				}
			}
			
			if(cars.isEmpty() == false)
			{
				System.out.println("Car Owned");
				System.out.println("--------------------------------");
				int index = 1;
				for(Car car : cars)
				{
					System.out.println("Car " + index + " details:");
					displayCar(car);
					index++;
				}
			}
			
			if(motorcycles.isEmpty() == false)
			{
				System.out.println("House Owned");
				System.out.println("--------------------------------");
				int index = 1;
				for(Motorcycle motorcycle : motorcycles)
				{
					System.out.println("Motorcycle " + index + " details:");
					displayMotorcycle(motorcycle);
					index++;
				}
			}
			
			if(golds.isEmpty() == false)
			{
				System.out.println("Gold Owned");
				System.out.println("--------------------------------");
				int index = 1;
				for(Gold gold : golds)
				{
					System.out.println("Gold " + index + " details:");
					displayGold(gold);
					index++;
				}
			}
			
			if(bankAccounts.isEmpty() == false)
			{
				System.out.println("Bank Accounts: ");
				System.out.println("--------------------------------");
				int index = 1;
				for(BankAccount bankAccount : bankAccounts)
				{
					System.out.println("Bank Account " + index + " details:");
					displayBankAccount(bankAccount);
					index++;
				}
			}
		}
		else if (choice == 8)
		{	
			Vector<Land> lands = AssetManager.getLands();
			Vector<House> houses = AssetManager.getHouses();
			Vector<Car> cars = AssetManager.getCars();
			Vector<Motorcycle> motorcycles = AssetManager.getMotorcycles();
			Vector<Gold> golds = AssetManager.getGolds();
			Vector<BankAccount> bankAccounts = AssetManager.getBankAccounts();
			
			double value = 0;
			
			// Just a line separator <hr></hr>
			System.out.println("*********************************************************************");
			
			if(lands.isEmpty() == false)
			{
				int index = 1;
				for(Land land : lands)
				{
					value += land.calculateMonetaryValue();
					index++;
				}
			}
			
			if(houses.isEmpty() == false)
			{
				int index = 1;
				for(House house : houses)
				{
					value += house.calculateMonetaryValue();
					index++;
				}
			}
			
			if(cars.isEmpty() == false)
			{	
				int index = 1;
				for(Car car : cars)
				{
					value += car.calculateMonetaryValue();
					index++;
				}
			}
			
			if(motorcycles.isEmpty() == false)
			{
				int index = 1;
				for(Motorcycle motorcycle : motorcycles)
				{
					value += motorcycle.calculateMonetaryValue();
					index++;
				}
			}
			
			if(golds.isEmpty() == false)
			{
				int index = 1;
				for(Gold gold : golds)
				{
					value += gold.calculateMonetaryValue();
					index++;
				}
			}
			
			if(bankAccounts.isEmpty() == false)
			{
				int index = 1;
				for(BankAccount bankAccount : bankAccounts)
				{
					value += bankAccount.calculateMonetaryValue();
					index++;
				}
			}
			
			System.out.println("Your Total Asset Is: " + value);
		}
	}
	
	
	private static void displayLand(Land land){
		System.out.println("Land Area: " + land.getArea());
		System.out.println("Land Price Per Area: " + land.getPricePerM2());
		
		System.out.println("Land Monetary Value: " + land.calculateMonetaryValue());
	}
	
	private static void displayHouse(House house){
		System.out.println("House Area: " + house.getArea());
		System.out.println("Number of Floor: " + house.getNumOfFloors());
		System.out.println("House Address: " + house.getAddress());
		System.out.println("House Market Value: " + house.getMarketValue());
		
		System.out.println("House Monetary Value: " + house.calculateMonetaryValue());
	}
	
	private static void displayCar(Car car){
		System.out.println("Car Plate No: " + car.getPlateNo());
		System.out.println("Car Model: " + car.getModel());
		System.out.println("Car Market Value: " + car.getMarketValue());
		
		System.out.println("Car Monetary Value: " + car.calculateMonetaryValue());
	}
	
	private static void displayMotorcycle(Motorcycle motorcycle){
		System.out.println("Motorcycle Plate No: " + motorcycle.getPlateNo());
		System.out.println("Motorcycle Model: " + motorcycle.getModel());
		System.out.println("Motorcycle Market Value: " + motorcycle.getMarketValue());
		
		System.out.println("Motorcycle Monetary Value" + motorcycle.calculateMonetaryValue());
	}
	
	private static void displayGold(Gold gold){
		System.out.println("Gold Karat: " + gold.getKarat());
		System.out.println("Gold Weight: " + gold.getWeight());
		System.out.println("Gold Price: " + gold.getPrice());
		
		System.out.println("Gold Monetary Value: " + gold.calculateMonetaryValue());
	}
	
	private static void displayBankAccount(BankAccount bankAccount){
		System.out.println("Bank Account Number: " + bankAccount.getAccountNo());
		System.out.println("Bank Name: " + bankAccount.getBankName());
		System.out.println("Bank Balance: " + bankAccount.getBalance());
		System.out.println("Bank Interest Rate: " + bankAccount.getInterestRate());
		
		System.out.println("Bank Monetary Value: " + bankAccount.calculateMonetaryValue());
	}
	
	
	
	
}
