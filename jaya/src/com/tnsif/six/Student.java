package com.tnsif.six;

public class Student {

    // private data members (encapsulation)
    private int id;
    private String name;

    // getter for id
    public int getId() {
        return id;
    }

    // setter for id
    public void setId(int id) {
        this.id = id;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // create object
        Student s = new Student();

        // using setters
        s.setId(101);
        s.setName("Krishna");

        // using getters
        System.out.println("Student ID: " + s.getId());
        System.out.println("Student Name: " + s.getName());
    }
}
