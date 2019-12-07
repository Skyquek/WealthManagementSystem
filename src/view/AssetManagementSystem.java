package view;
import java.util.Scanner;

import view.AssetManagementSystem;
import view.AssetView;
import view.View;

public class AssetManagementSystem extends View {
	
	public void displayOptions(){
        System.out.println("Welcome to Asset Management System");
        System.out.println("---------------------------------------");
        System.out.println("1 \t Manage Asset");
        System.out.println("0 \t Exit");
    }

    public void processOption(Scanner scanner, int choice) {
        switch (choice) {
            case 1: {
                AssetView av = new AssetView();
                av.displayOptions();
                av.selectOption(scanner, 9); // I use '0' as escape character

                displayOptions();
                break;

            } case 2: {
                System.out.println("You've selected: Manage Customers");
                break;

            } case 3: {
                System.out.println("You're selected: Manage Rentals");
                break;
            }
        }
    }
    
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        AssetManagementSystem assems = new AssetManagementSystem();

        assems.displayOptions();
        assems.selectOption(scanner, 3); // I use '0' as escape character
    }

}
