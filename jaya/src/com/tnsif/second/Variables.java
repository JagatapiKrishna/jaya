package com.tnsif.second;
public class Variables { 
	// Instance variable (belongs to object)
		    String name = "jk";
		    void display() {
		        // Local variable (inside method)
		        int age = 20;

		        System.out.println("Name (instance variable): " + name);
		        System.out.println("Age (local variable): " + age);
		    }

		    public static void main(String[] args) {
		        Variables obj = new Variables();
		        obj.display();
		    }
		}