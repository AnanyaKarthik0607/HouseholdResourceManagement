package com.household.model;

public class Water extends Resource {

    public Water(int resourceId, double unitsConsumed, double billAmount) {
        super(resourceId, "Water", unitsConsumed, billAmount);
    }

    @Override
    public void displayResource() {

        System.out.println("\n----- Water Details -----");
        System.out.println("Resource ID : " + getResourceId());
        System.out.println("Units : " + getUnitsConsumed());
        System.out.println("Bill : ₹" + getBillAmount());

    }
}