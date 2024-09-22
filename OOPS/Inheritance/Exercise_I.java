package Inheritenz;
// Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".

class Vehicle {
    public void drive(){
        System.out.println("Woo I'm drivin..");
    }    
}

class Car extends Vehicle {
    @Override
    public void drive(){
        System.out.println("Repairing a car");
    }
}


public class Exercise_I {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        Car obj2 = new Car();
        obj.drive();
        obj2.drive();

    }
}
