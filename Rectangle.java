package com.oops.constructor;

public class Rectangle {
	    int length;
	    int breadth;

	    Rectangle() {
	        length = 1;
	        breadth = 1;
	    }

	    Rectangle(int length, int breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }

	    int area() {
	        return length * breadth;
	    }

	    public static void main(String[] args) {
	        Rectangle r1 = new Rectangle();
	        Rectangle r2 = new Rectangle(4, 5);
	        System.out.println("Default Rectangle Area: " + r1.area());
	        System.out.println("Parameterized Rectangle Area: " + r2.area());
	    }
	}

