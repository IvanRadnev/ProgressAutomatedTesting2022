package com.company;

public class Main {

    public static void main(String[] args) {

    Movement car = new Car();
    Movement cycle = new Cycle();

    System.out.println(car.moveForward());
    System.out.println(car.moveBackward());

    System.out.println(cycle.moveForward());
    System.out.println(cycle.moveBackward());

    }
}
