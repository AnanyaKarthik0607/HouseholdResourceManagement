package com.household;

public class WasteRecommendation {

    public static void giveRecommendations(double electricity,
                                           double water,
                                           double lpg) {

        System.out.println("\n--- Recommendations ---");

        if (electricity > 300) {
            System.out.println("Electricity: Reduce unnecessary use of lights, fans and appliances.");
        }

        if (water > 10000) {
            System.out.println("Water: Avoid water wastage and repair leaking taps.");
        }

        if (lpg > 2) {
            System.out.println("LPG: Reduce unnecessary cooking gas usage and check for gas leakage.");
        }

        if (electricity <= 300 && water <= 10000 && lpg <= 2) {
            System.out.println("Your resource consumption is within the normal range.");
        }
    }
}
