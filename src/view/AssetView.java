package view;

import java.util.Scanner;
import java.util.Vector;
import java.sql.SQLException;

import controller.manager.AssetManager;
import model.Car;
import model.House;
import model.Land;
import model.Motorcycle;
import model.Gold;
import model.BankAccount;


public class AssetView extends View{
	public void displayOptions() {
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
		if(choice == 1) 
		{
			scanner.nextLine();

			System.out.println("Please enter the land details: ");
			System.out.println("Area of the Land: ");
			double landArea = scanner.nextDouble();
			System.out.println("Price Per Meter Squared: ");
			double landPriceM2 = scanner.nextDouble();
			
			Land land = new Land(landArea,landPriceM2);
						
			if(AssetManager.addLand(land) != 0)
			{
				System.out.println("Succesfull added a new land.");
			} 
			else 
			{
				System.err.println("Unable to add a new land.");
			}
			
		}
		else if (choice == 2) 
		{
			scanner.nextLine();

			System.out.println("Please enter the House details: ");
			System.out.println("Area of the House: ");
			double houseArea = scanner.nextDouble();
			
			System.out.println("Number of floor: ");
			int numOfFloor = scanner.nextInt();
			
			System.out.println("Address of the house: ");
			String address = scanner.nextLine();
			
			System.out.println("Market Value of the house: ");
			double houseMarketValue = scanner.nextDouble();
			
			House house = new House(houseArea,numOfFloor,address,houseMarketValue);
			
			if(AssetManager.addHouse(house) != 0)
			{
				System.out.println("Succesfull added a new House.");
			} 
			else 
			{
				System.err.println("Unable to add a new House.");
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
			double carMarketValue = scanner.nextDouble();
			
			Car car = new Car(carPlateNo,carModel,carMarketValue);
			
			if(AssetManager.addCar(car) != 0)
			{
				System.out.println("Succesfull added a new Car.");
			} 
			else 
			{
				System.err.println("Unable to add a new Car.");
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
			double motorcycleMarketValue = scanner.nextDouble();
			
			Motorcycle motorcycle = new Motorcycle(motorcyclePlateNo,motorcycleModel,motorcycleMarketValue);
			
			if(AssetManager.addMotorcycle(motorcycle) != 0)
			{
				System.out.println("Succesfull added a new Motorcycle.");
			} 
			else 
			{
				System.err.println("Unable to add a new Motorcycle.");
			}
				
		}
		else if (choice == 5) 
		{
			scanner.nextLine();

			System.out.println("Please enter the Gold details: ");
			
			System.out.println("Gold's Karat: ");
			int karat = scanner.nextInt();
			
			System.out.println("Gold's Weight: ");
			double weight = scanner.nextDouble();
			
			System.out.println("Gold's Price: ");
			double price = scanner.nextDouble();
			
			Gold gold = new Gold(karat,weight,price);
			
			
			if(AssetManager.addGold(gold) != 0)
			{
				System.out.println("Succesfull added a new Gold.");
			} 
			else 
			{
				System.err.println("Unable to add a new Gold.");
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
			double balance = scanner.nextDouble();
			
			System.out.println("Bank Account Interest Rate: ");
			double interestRate = scanner.nextDouble();
			
			BankAccount bankAccount = new BankAccount(accountNo,bankName,balance,interestRate);
			
			if(AssetManager.addBankAccounts(bankAccount) != 0)
			{
				System.out.println("Succesfull added a new Bank Account.");
			} 
			else 
			{
				System.err.println("Unable to add a new Bank Account.");
			}
				
		}
		else if (choice == 7)
		{	
			Vector<Land> lands = AssetManager.getLands();
			if(lands.isEmpty() == false)
			{
				System.out.println("Land");
				System.out.println("--------------------------------");
				int index = 1;
				for(Land land : lands)
				{
					System.out.println("Land " + index + " details:");
					displayLand(land);
					index++;
				}
			}
			
			
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
