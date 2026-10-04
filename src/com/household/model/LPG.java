package com.household.model;

public class LPG extends Resource {

    public LPG(int resourceId, double unitsConsumed, double billAmount) {
        super(resourceId, "LPG", unitsConsumed, billAmount);
    }

    @Override
    public void displayResource() {

        System.out.println("\n----- LPG Details -----");
        System.out.println("Resource ID : " + getResourceId());
        System.out.println("Units : " + getUnitsConsumed());
        System.out.println("Bill : ₹" + getBillAmount());

    }
}