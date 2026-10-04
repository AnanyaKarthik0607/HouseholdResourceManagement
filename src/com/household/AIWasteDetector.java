package com.household;

public class AIWasteDetector {

    public static String detectWaste(double electricity,
                                     double water,
                                     double lpg) {

        int wasteCount = 0;

        // Check electricity consumption
        if (electricity > 300) {
            wasteCount++;
        }

        // Check water consumption
        if (water > 10000) {
            wasteCount++;
        }

        // Check LPG consumption
        if (lpg > 2) {
            wasteCount++;
        }

        // Final waste detection
        if (wasteCount >= 2) {
            return "WASTEFUL";
        } else {
            return "NORMAL";
        }
    }

    public static void analyzeResources(double electricity,
                                        double water,
                                        double lpg) {

        System.out.println("\n--- AI Analysis ---");

        // Analyze electricity
        if (electricity > 300) {
            System.out.println("Electricity usage is HIGH.");
        } else {
            System.out.println("Electricity usage is NORMAL.");
        }

        // Analyze water
        if (water > 10000) {
            System.out.println("Water usage is HIGH.");
        } else {
            System.out.println("Water usage is NORMAL.");
        }

        // Analyze LPG
        if (lpg > 2) {
            System.out.println("LPG usage is HIGH.");
        } else {
            System.out.println("LPG usage is NORMAL.");
        }
    }
    public static int calculateWasteScore(double electricity,
                                          double water,
                                          double lpg) {

        int score = 0;

        // Electricity scoring
        if (electricity > 500) {
            score += 40;
        } else if (electricity > 300) {
            score += 20;
        }

        // Water scoring
        if (water > 15000) {
            score += 35;
        } else if (water > 10000) {
            score += 17;
        }

        // LPG scoring
        if (lpg > 4) {
            score += 25;
        } else if (lpg > 2) {
            score += 12;
        }

        return score;
    }
    public static String getWasteLevel(int score) {

        if (score <= 30) {
            return "LOW WASTE";
        } else if (score <= 60) {
            return "MODERATE WASTE";
        } else {
            return "HIGH WASTE";
        }
    }
}