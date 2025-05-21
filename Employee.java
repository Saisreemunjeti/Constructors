package com.oops.constructor;

public class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = (salary < 0) ? 0 : salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 5000);
        Employee e2 = new Employee("Bob", -1000);
        e1.displayDetails();
        e2.displayDetails();
    }
}