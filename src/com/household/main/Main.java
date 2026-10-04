package com.household.main;

import com.household.AIWasteDetector;
import com.household.WasteRecommendation;

public class Main {

    public static void main(String[] args) {

        HouseholdSystem system = new HouseholdSystem();
        system.menu();

        System.out.println("\n--- AI Waste Detection ---");

        double electricity = system.getElectricityConsumption();
        double water = system.getWaterConsumption();
        double lpg = system.getLpgConsumption();

        System.out.println("Electricity Consumption: " + electricity + " kWh");
        System.out.println("Water Consumption: " + water + " litres");
        System.out.println("LPG Consumption: " + lpg + " cylinders");

        String aiResult = AIWasteDetector.detectWaste(
                electricity, water, lpg
        );

        System.out.println("\nAI Detection Result: " + aiResult);

        AIWasteDetector.analyzeResources(
                electricity, water, lpg
        );

        int wasteScore = AIWasteDetector.calculateWasteScore(
                electricity, water, lpg
        );

        System.out.println("\nWaste Score: " + wasteScore + " / 100");
        String wasteLevel = AIWasteDetector.getWasteLevel(wasteScore);

        System.out.println("Waste Level: " + wasteLevel);
    }
}