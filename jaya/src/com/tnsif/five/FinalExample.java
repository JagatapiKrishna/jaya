package com.tnsif.five;

//final class (cannot be inherited)
final class Vehicle {
 // final variable
 final int wheels = 4;

 // final method
 final void display() {
     System.out.println("A vehicle usually has " + wheels + " wheels.");
 }
}

//If we try to extend Vehicle, it will give error
//class Car extends Vehicle { }   // ❌ Not allowed

public class FinalExample {
 public static void main(String[] args) {
     Vehicle v = new Vehicle();
     v.display();

     // v.wheels = 6;  // ❌ Error: cannot assign a value to final variable
 }
}
