package com.company;

public class Car implements Movement{


    @Override
    public String moveForward() {
        return "Move Forward is easy!";
    }

    @Override
    public String moveBackward() {
        return "Move Backward is easy too!";
    }
}
