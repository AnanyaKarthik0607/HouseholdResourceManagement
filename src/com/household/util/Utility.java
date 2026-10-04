package com.household.util;

public class Utility {

    // Electricity Bill = ₹8 per unit
    public static double calculateElectricityBill(double units) {
        return units * 8;
    }

    // Water Bill = ₹2 per litre
    public static double calculateWaterBill(double litres) {
        return litres * 2;
    }

    // LPG Cost = ₹950 per cylinder
    public static double calculateLPGBill(int cylinders) {
        return cylinders * 950;
    }

}