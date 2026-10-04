package com.household.main;
import com.household.model.Electricity;
import com.household.model.Water;
import com.household.model.LPG;

import java.util.Scanner;
import com.household.model.Resource;
import com.household.model.User;

public class HouseholdSystem {

    Scanner sc = new Scanner(System.in);

    Resource[] resources = new Resource[100];
    User[] users = new User[100];

    int resourceCount = 0;
    int userCount = 0;
    double electricityConsumption = 0;
    double waterConsumption = 0;
    double lpgConsumption = 0;

    public void menu() {

        int choice;

        do {

            System.out.println("\n=====================================");
            System.out.println(" HOUSEHOLD RESOURCE MANAGEMENT SYSTEM");
            System.out.println("=====================================");
            System.out.println("1. Register User");
            System.out.println("2. Add Resource");
            System.out.println("3. Display Resources");
            System.out.println("4. Search Resource");
            System.out.println("5. View Statistics");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    registerUser();
                    break;

                case 2:
                    addResource();
                    break;

                case 3:
                    displayResources();
                    break;

                case 4:
                    searchResource();
                    break;

                case 5:
                    viewStatistics();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);
    }

    public void registerUser() {

        System.out.print("Enter User ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        users[userCount] = new User(id, name, address, phone);
        userCount++;

        System.out.println("User Registered Successfully!");
    }

    public void addResource() {

        System.out.print("Enter Resource ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Resource Type (Electricity/Water/LPG): ");
        String type = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        double units = sc.nextDouble();

        double bill = 0;

        if (type.equalsIgnoreCase("Electricity") ||
                type.equalsIgnoreCase("LPG")) {

            System.out.print("Enter Bill Amount: ");
            bill = sc.nextDouble();
        }

        if (type.equalsIgnoreCase("Electricity")) {
            resources[resourceCount] = new Electricity(id, units, bill);
            electricityConsumption += units;

        } else if (type.equalsIgnoreCase("Water")) {
            resources[resourceCount] = new Water(id, units, bill);
            waterConsumption += units;

        } else if (type.equalsIgnoreCase("LPG")) {
            resources[resourceCount] = new LPG(id, units, bill);
            lpgConsumption += units;

        } else {
            System.out.println("Invalid Resource Type!");
            return;
        }

        resourceCount++;
        System.out.println("Resource Added Successfully!");
    }

    public void displayResources() {

        if (resourceCount == 0) {
            System.out.println("No Resources Found.");
            return;
        }

        for (int i = 0; i < resourceCount; i++) {
            resources[i].displayResource();
        }
    }

    public void searchResource() {

        System.out.print("Enter Resource ID: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < resourceCount; i++) {

            if (resources[i].getResourceId() == id) {

                resources[i].displayResource();
                found = true;
                break;
            }

        }

        if (!found) {
            System.out.println("Resource Not Found!");
        }

    }

    public void viewStatistics() {

        System.out.println("\n------ Statistics ------");
        System.out.println("Total Users : " + userCount);
        System.out.println("Total Resources : " + resourceCount);

    }
    public double getElectricityConsumption() {
        return electricityConsumption;
    }

    public double getWaterConsumption() {
        return waterConsumption;
    }

    public double getLpgConsumption() {
        return lpgConsumption;
    }
}