package com.tnsif.inheritances;

//Parent Class
class Vehicle {
 void start() {
     System.out.println("Vehicle is starting...");
 }
}

//Child Class 1
class Car extends Vehicle {
 void drive() {
     System.out.println("Car is driving...");
 }
}

//Child Class 2
class Bike extends Vehicle {
 void ride() {
     System.out.println("Bike is riding...");
 }
}

public class HierarchicalInheritanceDemo {
 public static void main(String[] args) {
     Car car = new Car();
     car.start();   // inherited from Vehicle
     car.drive();   // Car's own method

     System.out.println();

     Bike bike = new Bike();
     bike.start();  // inherited from Vehicle
     bike.ride();   // Bike's own method
 }
}