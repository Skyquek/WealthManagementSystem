package view;
import java.util.Scanner;

import view.AssetManagementSystem;
import view.AssetView;
import view.View;

/*
 * Author: Quek Yao Jing B031810136
 */

public class AssetManagementSystem extends View {
	
	public void displayOptions(){
        System.out.println("Welcome to Wealth Management System");
        System.out.println("---------------------------------------");
        System.out.println("1 \t Manage Asset");
        System.out.println("0 \t Exit");
    }

    public void processOption(Scanner scanner, int choice) {
        switch (choice) {
            case 1: {
                AssetView av = new AssetView();
                av.displayOptions();
                av.selectOption(scanner, 9); 

                displayOptions();
                break;

            }
        }
    }
    
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        AssetManagementSystem assems = new AssetManagementSystem();

        assems.displayOptions();
        assems.selectOption(scanner, 3); 
    }

}
