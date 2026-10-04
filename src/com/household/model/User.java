package com.household.model;

public class User {

    private int userId;
    private String name;
    private String address;
    private String phone;

    private static int userCount = 0;

    // Default Constructor
    public User() {
    }

    // Parameterized Constructor
    public User(int userId, String name, String address, String phone) {
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        userCount++;
    }

    // Copy Constructor
    public User(User u) {
        this.userId = u.userId;
        this.name = u.name;
        this.address = u.address;
        this.phone = u.phone;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static int getUserCount() {
        return userCount;
    }

    public void displayUser() {
        System.out.println("\n----- User Details -----");
        System.out.println("User ID : " + userId);
        System.out.println("Name    : " + name);
        System.out.println("Address : " + address);
        System.out.println("Phone   : " + phone);
    }
}