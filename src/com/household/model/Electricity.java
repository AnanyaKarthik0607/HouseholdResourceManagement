package com.household.model;

public class Electricity extends Resource {

    public Electricity(int resourceId, double unitsConsumed, double billAmount) {
        super(resourceId, "Electricity", unitsConsumed, billAmount);
    }

    @Override
    public void displayResource() {

        System.out.println("\n----- Electricity Details -----");
        System.out.println("Resource ID : " + getResourceId());
        System.out.println("Units : " + getUnitsConsumed());
        System.out.println("Bill : ₹" + getBillAmount());

    }
}