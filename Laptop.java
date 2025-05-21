package com.oops.constructor;

import java.util.Scanner;

class Laptop {
    String brand;
    int ramSize;

    Laptop(String brand, int ramSize) {
        this.brand = brand;
        this.ramSize = ramSize;
    }
    void showSpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM Size: " + ramSize + "GB");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter RAM size (in GB): ");
        int ram = sc.nextInt();
        Laptop userLaptop = new Laptop(brand, ram);
        Laptop defaultLaptop = new Laptop("Dell", 8);
        System.out.println("\nUser Laptop Specs:");
        userLaptop.showSpecs();
        System.out.println("\nDefault Laptop Specs:");
        defaultLaptop.showSpecs();
    }
}