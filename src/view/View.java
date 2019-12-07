package view;

import java.util.Scanner;

abstract class View{
    abstract void displayOptions();

    abstract void processOption(Scanner scanner, int choice);

    int selectOption(Scanner scanner, int maximum){
        int choice;

        do{
            choice = -1;
            while (choice < 0 || choice > maximum){
                System.out.print("Please enter an option: ");
                choice = scanner.nextInt();

                if(choice < 0 || choice > maximum){
                    System.out.println("Invalid option, please try again.");
                }
            }

            processOption(scanner, choice);


        } while (choice != 0); // I'm using '0' as an escape character.

        return choice;
    }
}