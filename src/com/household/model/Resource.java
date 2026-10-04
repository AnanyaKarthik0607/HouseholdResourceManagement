package com.household.model;

/**
 * Resource class to store household resource details.
 */
public abstract class Resource {

    private int resourceId;
    private String resourceType;
    private double unitsConsumed;
    private double billAmount;

    // Default Constructor
    public Resource() {
    }

    // Parameterized Constructor
    public Resource(int resourceId, String resourceType, double unitsConsumed, double billAmount) {
        this.resourceId = resourceId;
        this.resourceType = resourceType;
        this.unitsConsumed = unitsConsumed;
        this.billAmount = billAmount;
    }

    // Copy Constructor
    public Resource(Resource r) {
        this.resourceId = r.resourceId;
        this.resourceType = r.resourceType;
        this.unitsConsumed = r.unitsConsumed;
        this.billAmount = r.billAmount;
    }

    // Getters and Setters
    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public double getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setUnitsConsumed(double unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public abstract void displayResource();
}