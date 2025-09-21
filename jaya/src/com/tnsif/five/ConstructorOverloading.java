package com.tnsif.five;

public class ConstructorOverloading {

    private int id;
    private String name;

    // Default constructor
    ConstructorOverloading() {
        id = 0;
        name = "Unknown";
    }

    // Constructor with one parameter
    ConstructorOverloading(int id) {
        this.id = id;
        name = "Not Provided";
    }

    // Constructor with two parameters
    ConstructorOverloading(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Display method
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        // Calling different constructors
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(101);
        ConstructorOverloading obj3 = new ConstructorOverloading(102, "Krishna");

        // Displaying the values
        obj1.display();
        obj2.display();
        obj3.display();
    }
}
